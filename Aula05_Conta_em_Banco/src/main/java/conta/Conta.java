package conta;
public class Conta {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Método Construtor
    public Conta() {
        this.saldo = 0;
        this.status = false;
    }
    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("----------ALDIM BANK--------------");
        System.out.println("Dono: "+this.getDono());
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t =="CC"){
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("A Conta foi aberta com sucesso");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("A Conta não pode ser fechada, Ainda tem dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("A Conta está negativa, regularize para fechar");
        } else {
            this.setStatus(false);
            System.out.println("Conta Fechada com Sucesso");
        }
    }
    
    public void depositar(float v){
        if (getStatus()) {
            this.setSaldo(getSaldo()+v);
            System.out.println("Depósito realizado");
        } else {
            System.out.println("Não foi possível depositar, a conta está fechada");
        }
    }
    
    public void sacar(float v){
        if (getStatus()){
            if (getSaldo() >= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque Realizado com sucesso. Seu Saldo agora é: " + this.getSaldo());
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Conta fechada, Impossível sacar");
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo()=="CC") {
            v = 12;
        } else if (this.getTipo()== "CP") {
            v =  20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso");
        } else {
            System.out.println("Impossível Debitar Mensalidade, a conta está fechada");
        }
    }
    //Métodos Especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
