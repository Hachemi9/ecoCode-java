public class MakeVariableConstantTest {

    public void testEc82() {
        String test = "test"; // Noncompliant {{Use 'final' for variables that are not reassigned.}}
        System.out.println("Hello World");
    }
}
