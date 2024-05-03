public class ProgramLogicDoer implements Runnable {
   CoolData inData;

    public ProgramLogicDoer(CoolData queue) {
    }

    public void run() {
        Object inMessage1 = inData.get();

        while (true) {
            if(inMessage1 != null) {
                System.out.println(inMessage1);

            }
            inMessage1 = inData.get();
        }

    }
}
