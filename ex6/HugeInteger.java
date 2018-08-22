public class HugeInteger {
    private long[] hugeInteger;
    public int i;

    public HugeInteger(){
        this.hugeInteger = new long[40];
        this.i = 0;
    }

    public void inputHugeInteger(long input){
        if(input < Math.pow(10, 18))
            System.out.println("\nErro: Digite um Huge Integer com 19 digitos!!\n");

        else{
            this.hugeInteger[i] = input;
            System.out.println("\nHuge Integer adicionado com sucesso!!\n");
            i++;
        }
    }

    public void outputHugeInteger(int index){
        if(this.hugeInteger[index] == 0)
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index);

        else
            System.out.println("Huge Integer: "+ this.hugeInteger[index]);
    }

    public long addHugeIntegers(int index1, int index2){
        if(this.hugeInteger[index1] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index1);
            return -1;
        }

        else if(this.hugeInteger[index2] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index2);
            return -1;
        }

        else
            return (this.hugeInteger[index1] + this.hugeInteger[index2]);
    }

    public long subtractHugeIntegers(int index1, int index2){
        if(this.hugeInteger[index1] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index1);
            return -1;
        }

        else if(this.hugeInteger[index2] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index2);
            return -1;
        }

        else
            return (this.hugeInteger[index1] - this.hugeInteger[index2]);
    }

    public boolean isEqualTo​(int index1, int index2){
        if(this.hugeInteger[index1] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index1);
            return false;
        }

        else if(this.hugeInteger[index2] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index2);
            return false;
        }

        else if(this.hugeInteger[index1] == this.hugeInteger[index2] && this.hugeInteger[index1] != 0 && this.hugeInteger[index2] != 0)
            return true;

        else
            return false;
    }

    public boolean isNotEqualTo​(int index1, int index2){
        if(this.hugeInteger[index1] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index1);
            return false;
        }

        else if(this.hugeInteger[index2] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index2);
            return false;
        }

        else if(this.hugeInteger[index1] != this.hugeInteger[index2] && this.hugeInteger[index1] != 0 && this.hugeInteger[index2] != 0)
            return true;

        else
            return false;
    }

    public boolean isGreaterThan(int index1, int index2){
        if(this.hugeInteger[index1] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index1);
            return false;
        }

        else if(this.hugeInteger[index2] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index2);
            return false;
        }

        else if(this.hugeInteger[index1] > this.hugeInteger[index2] && this.hugeInteger[index1] != 0 && this.hugeInteger[index2] != 0)
            return true;

        else
            return false;
    }

    public boolean isLessThan(int index1, int index2){
        if(this.hugeInteger[index1] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index1);
            return false;
        }

        else if(this.hugeInteger[index2] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index2);
            return false;
        }

        else if(this.hugeInteger[index1] < this.hugeInteger[index2] && this.hugeInteger[index1] != 0 && this.hugeInteger[index2] != 0)
            return true;

        else
            return false;
    }

    public boolean isGreaterThanOrEqualTo(int index1, int index2){
        if(this.hugeInteger[index1] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index1);
            return false;
        }

        else if(this.hugeInteger[index2] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index2);
            return false;
        }

        else if(this.hugeInteger[index1] >= this.hugeInteger[index2] && this.hugeInteger[index1] != 0 && this.hugeInteger[index2] != 0)
            return true;

        else
            return false;
    }

    public boolean isLessThanOrEqualTo(int index1, int index2){
        if(this.hugeInteger[index1] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index1);
            return false;
        }

        else if(this.hugeInteger[index2] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index2);
            return false;
        }

        else if(this.hugeInteger[index1] <= this.hugeInteger[index2] && this.hugeInteger[index1] != 0 && this.hugeInteger[index2] != 0)
            return true;

        else
            return false;
    }

    public boolean isZero(){
        if(this.hugeInteger[0] == 0)
            return true;

        else
            return false;
    }

    public int tamanho(){
        return this.hugeInteger.length;
    }

    public long multiplyHugeIntegers(int index1, int index2){
        if(this.hugeInteger[index1] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index1);
            return -1;
        }

        else if(this.hugeInteger[index2] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index2);
            return -1;
        }

        else
            return(999999999999999999l);
    }

    public long divideHugeIntegers(int index1, int index2) {
        if(this.hugeInteger[index1] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index1);
            return -1;
        }

        else if(this.hugeInteger[index2] == 0){
            System.out.println("Erro: Nao existe Huge Integer armazenado na posicao "+ index2);
            return -1;
        }

        else
            return (this.hugeInteger[index1] / this.hugeInteger[index2]);
    }
}
