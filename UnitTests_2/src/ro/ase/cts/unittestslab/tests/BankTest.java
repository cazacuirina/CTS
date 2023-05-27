package ro.ase.cts.unittestslab.tests;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ro.ase.cts.unittestslab.Bank;
import ro.ase.cts.unittestslab.BankAccount;
import ro.ase.cts.unittestslab.Client;

import java.io.FileWriter;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BankTest {

    private BankAccount bankAccount;
    private Client client;
    private Bank bank;

    private static int passedTestsBank = 0;
    private static int passedTestsClient = 0;
    private static int passedTestsAccount = 0;

    @Parameterized.Parameter(value = 0)
    public double amount;

    @Parameterized.Parameter(value = 1)
    public String currency;

    @Parameterized.Parameter(value = 2)
    public String iban;

    @Parameterized.Parameter(value = 3)
    public String clientName;

    @Parameterized.Parameter(value = 4)
    public String cnp;

    @Parameterized.Parameter(value = 5)
    public String bankName;

    @Parameterized.Parameter(value = 6)
    public String address;

    @Parameterized.Parameter(value = 7)
    public String swiftCode;

    // Seturi de date (corecte + incorecte)
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { 1500.999 , "EUR", "RO52INGX1B31007593840000", "Ionel Popescu", "5011001253397", "BCR bank" ,"Strada Margeanului", "BCRX-BC-YZ-185" },
                { 2450.999 , "CH",  "RO52BCRX1B34537593760000", "Ana-Maria", "601101253316", "Banca Transilvania" ,"Bd. Atena", "BCRX-IF-XX-12B" }
        };
        return Arrays.asList(data);
    }

    @Before
    public void setUp() throws Exception {
        bankAccount=new BankAccount("RO52BCRX1B31007593840000", 1987.99, "RON", false);
        client=new Client("Matei Iancu", "5020302889354");
        bank=new Bank("ING bank", "Str Mihai Eminescu", "INGX-BC-ZY-262");
    }

    @After
    public void tearDown() throws Exception {
        bankAccount=null;
        client=null;
        bank=null;
    }

    @AfterClass
    public static void globalCleanUp() throws Exception {
        System.out.println("TESTE TRECUTE\nBanca: "+passedTestsBank+
                "/8\nCont bancar: "+passedTestsAccount+
                "/10\nClient: "+passedTestsClient +"/6");
    }

    // BANK ACCOUNT TESTS
    @Test
    public void block() {
        bankAccount.block();
        assertEquals("Contul nu a fost blocat", bankAccount.isBlocked(), true);
        passedTestsAccount++;
    }

    @Test
    public void unblock() {
        bankAccount.unblock();
        assertEquals("Contul nu a fost deblocat", bankAccount.isBlocked(), false);
        passedTestsAccount++;
    }

    @Test
    public void setAmount() {
        bankAccount.setAmount(amount);
        assertEquals("Suma depusa nu a fost recuperata", bankAccount.getAmount(), amount, 0.01);
        passedTestsAccount++;
    }

    @Test
    public void setCurrency() {
        bankAccount.setCurrency(currency);
        assertEquals("Set nu este implementat corect", currency, bankAccount.getCurrency());
        assertTrue("Fix 3 caratere", bankAccount.getCurrency().length()==3);
        assertTrue("Format cod incorect: LLLL", bankAccount.getCurrency().matches("[A-Z]{3}"));
        passedTestsAccount++;
    }

    @Test
    public void setIban() {
        bankAccount.setIbanCode(iban);
        assertEquals("Set nu este implementat corect", iban, bankAccount.getIbanCode());
        assertTrue("Fix 24 caratere", bankAccount.getIbanCode().length()==24);
        assertTrue("Format cod incorect: LLLL", bankAccount.getIbanCode().matches("[A-Z]{2}\\d{2}[A-Z]{4}[\\dA-Z]{16}"));
        String bankCode=bank.getSwiftCode().substring(0,3);
        assertTrue("Codul bancii este incorect", bankAccount.getIbanCode().contains(bankCode));
        passedTestsAccount++;
    }

    // CLIENT TESTS
    @Test
    public void setClientName() {
        client.setName(clientName);
        assertEquals("Set nu este implementat corect", clientName, client.getName());
        assertTrue("Contine cel putin 1 spatiu", client.getName().contains(" "));
        String[] names=clientName.split(" ");
        for (String name : names) {
            assertTrue("Prima litera trebuie sa fie majuscula", Character.isUpperCase(name.charAt(0)));
        }
        passedTestsClient++;
    }

    @Test
    public void setCNP() {
        client.setId(cnp);
        assertEquals("Set nu este implementat corect", cnp, client.getId());
        assertTrue("Fix 13 caratere", client.getId().length()==13);
        assertTrue("Format CNP: 13 cifre", client.getId().matches("\\d{13}"));
        passedTestsClient++;
    }

    @Test
    public void addAccount(){
        client.addAccount(bankAccount);
        assertTrue("Contul nu a putut fi adaugat", client.getAccounts().contains(bankAccount));
        passedTestsClient++;
    }

    // BANK TESTS
    @Test
    public void setBankName() {
        bank.setName(bankName);
        assertEquals("Set nu este implementat corect", bankName, bank.getName());
        assertTrue("Minim 5 caratere", bank.getName().length()>=5);
        assertTrue("Trebuie sa contina cuvantul bank", bank.getName().toLowerCase(Locale.ROOT).contains("bank"));
        passedTestsBank++;
    }

    @Test
    public void setAddress() {
        bank.setAddress(address);
        assertEquals("Set nu este implementat corect", address, bank.getAddress());
        assertTrue("Minim 10 caratere", bank.getAddress().length()>=10);
        passedTestsBank++;
    }

    @Test
    public void setSwiftCode() {
        bank.setSwiftCode(swiftCode);
        assertEquals("Set nu este implementat corect", swiftCode, bank.getSwiftCode());
        assertTrue("Fix 14 caratere", bank.getSwiftCode().length()==14);
        assertTrue("Format cod incorect: LLLL-LL-LL-CCC", bank.getSwiftCode().matches("[A-Z]{4}-[A-Z]{2}-[A-Z]{2}-\\d{3}"));
        passedTestsBank++;
    }
    @Test
    public void getClientByCNP(){
        bank.addNewClient(client);
        assertEquals("Set nu este implementat corect", bank.getClientByCNP(client.getId()), client);
        passedTestsBank++;
    }
}