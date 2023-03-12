import builders.EmpresaBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmpresaBuiderTest {
    @Test
    void deveRetornarEmpresa() {
        var empresaBuilder = new EmpresaBuilder();
        var empresa = empresaBuilder
                .setCnpj("12345678910124")
                .setNomeFantasia("Distribuidora Garparzinho")
                .setTelefone("32930301010")
                .setRazaoSocial("Empresa fantasma")
                .build();

        assertNotNull(empresa);
    }

    @Test
    void deveRetornarCnpjIncompleto() {
        try {
            var empresaBuilder = new EmpresaBuilder();
            empresaBuilder
                .setTelefone("32930301010")
                .setNomeFantasia("Distribuidora Garparzinho")
                .setRazaoSocial("Empresa fantasma")
                .build();
        } catch (Exception ex) {
            assertEquals("O CNPJ está incompleto.", ex.getMessage());
        }
    }

    @Test
    void deveRetornarTelefoneInvalido() {
        try {
            var empresaBuilder = new EmpresaBuilder();
            empresaBuilder
                    .setCnpj("12345678910124")
                    .setNomeFantasia("Distribuidora Garparzinho")
                    .setRazaoSocial("Empresa fantasma")
                    .build();
        } catch (Exception ex) {
            assertEquals("Número de telefone inválido.", ex.getMessage());
        }
    }

    @Test
    void deveRetornarNomeFantasiaInvalido() {
        try {
            var empresaBuilder = new EmpresaBuilder();
            empresaBuilder
                    .setCnpj("12345678910124")
                    .setTelefone("32930301010")
                    .setRazaoSocial("Empresa fantasma")
                    .build();
        } catch (Exception ex) {
            assertEquals("Nome fantasia inválido.", ex.getMessage());
        }
    }

    @Test
    void deveRetornarRazaoSocialInvalida() {
        try {
            var empresaBuilder = new EmpresaBuilder();
            empresaBuilder
                    .setCnpj("12345678910124")
                    .setTelefone("32930301010")
                    .setNomeFantasia("Distribuidora Garparzinho")
                    .build();
        } catch (Exception ex) {
            assertEquals("Razão social inválida.", ex.getMessage());
        }
    }
}
