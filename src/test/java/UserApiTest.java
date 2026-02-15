import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class UserApiTest {

    @Test
    @DisplayName("Validar que a lista de usuários não está vazia")
    public void deveListarUsuariosComSucesso() {
        given()
                .baseUri("https://serverest.dev")
                .when()
                .get("/usuarios")
                .then()
                .statusCode(200)
                .body("quantidade", is(greaterThan(0)))
                .body("usuarios.nome", hasItem("Fulano da Silva"));
    }
}