package abstractAndInterface;

interface interfaceimp {
    void play();

    void run();

    int a = 10;
    double marks = 290.2;

}

class interfaceimpl implements interfaceimp {
    public void play() {
        System.out.println("playing...");
    };
    
    public void run() {
        System.out.println("runnig..");
    }

    public static void main(String[] args) {
        interfaceimpl i1 = new interfaceimpl();
        i1.play();
        i1.run();
        System.out.println(interfaceimp.marks);
    }

}