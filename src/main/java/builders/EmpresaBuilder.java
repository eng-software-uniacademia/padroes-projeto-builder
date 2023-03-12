package builders;

import models.Empresa;

public class EmpresaBuilder {
    private final Empresa empresa;

    public Empresa build() {
        if (empresa.getCnpj().length() < 14)
            throw new IllegalArgumentException("O CNPJ está incompleto.");

        if (empresa.getNomeFantasia().length() < 3)
            throw new IllegalArgumentException("Nome fantasia inválido.");

        if (empresa.getTelefone().length() < 10)
            throw new IllegalArgumentException("Número de telefone inválido.");

        if (empresa.getRazaoSocial().length() < 6)
            throw new IllegalArgumentException("Razão social inválida.");

        return empresa;
    }

    public EmpresaBuilder() {
        empresa = new Empresa();
    }

    public EmpresaBuilder setCnpj(String cnpj) {
        empresa.setCnpj(cnpj);
        return this;
    }

    public EmpresaBuilder setRazaoSocial(String razaoSocial) {
        empresa.setRazaoSocial(razaoSocial);
        return this;
    }

    public EmpresaBuilder setNomeFantasia(String nomeFantasia) {
        empresa.setNomeFantasia(nomeFantasia);
        return this;
    }

    public EmpresaBuilder setTelefone(String telefone) {
        this.empresa.setTelefone(telefone);
        return this;
    }
}
