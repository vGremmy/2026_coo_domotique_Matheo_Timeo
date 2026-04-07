class Hifi {
    int son = 0;

    public void allumer() {
        this.son += 10;
        if (this.son > 100) {
            this.son = 100;
        }
    }

    public void eteindre() {
        this.son = 0;
    }

    @Override
    public String toString() {
        return "Hifi:" + son;
    }
}