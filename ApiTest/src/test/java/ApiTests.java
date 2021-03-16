import extensions.RetryAnalyzer;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.Timestamp;


public class ApiTests {
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void Test() throws IOException{
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
        PetBase petBase = new PetBase();
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long id = timestamp.getTime();

        petBase.createPet(id);
        petBase.checkPet(id);
        petBase.updatePet(id,"doggy","name");
        petBase.checkPetUpdate(id,"doggy","name");
        petBase.deletePet(id);
        petBase.validatePetDeletion(id);

    }

}
