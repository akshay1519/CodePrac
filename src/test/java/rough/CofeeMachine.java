package rough;

public class CofeeMachine {
    private float cofeeQty;
    private float watQty;
    private static CofeeMachine cfm = null;
    private CofeeMachine(){
        cofeeQty = 1;
        watQty = 1;
    }
    static public CofeeMachine getCofeeMachineInstance(){
        if (cfm==null)
            cfm = new CofeeMachine();
        return cfm;
    }

    public static void main(String[] args) {
        CofeeMachine cf = getCofeeMachineInstance();
        CofeeMachine cf1 = getCofeeMachineInstance();
        CofeeMachine cf2 = getCofeeMachineInstance();
        System.out.println(cf);
        System.out.println(cf1);
        System.out.println(cf2);

    }
}
