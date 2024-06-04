public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. A Data será alterada para: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }
    public void setDia(int dia) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido. O valor será mantido.");
        }
    }
    public void setMes(int mes) {
        if (validaData(dia, mes, ano)) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido. O valor será mantido.");
        }
    }
    public void setAno(int ano) {
        if (validaData(dia, mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido. O valor será mantido.");
        }
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto() {
        if (this.ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0 )) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > DiasNoMes(mes, ano)) {
            return false;
        } else {
            return true;
        }
    }

    private int DiasNoMes(int mes, int ano) {
        int[] diasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && verificaAnoBissexto()) {
            return 29;
        }
        return diasNoMes[mes - 1];
    }
}
