package edu.eci.cvds;

import org.junit.Assert;
import org.junit.Test;
public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person();
        person.setAge(19);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void dado_unaPersona_cuando_EsMenorDeEdad_entones_retorneUNDERAGE(){
        Person person = new Person();
        person.setAge(16);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void dado_unaPersona_cuando_EstaFueraDelRangoDeEdad_entones_retorneINVALID_AGE(){
        Person person = new Person();
        person.setAge(-6);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    // TODO Complete with more test cases
}
