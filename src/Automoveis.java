class Automoveis implements Comparable{
    int index;
    String name;
    String marca;
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public int compareTo(Object arg0) {
        Automoveis p = (Automoveis)arg0;
        return p.getIndex();
    }
}
