import lsp.AustraliaOpenCourt;
import lsp.Court;
import lsp.RolandGarrosCourt;
import lsp.WimbledonCourt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        testCourt();
    }

    public static void testCourt(){
        List<Court> courts = new ArrayList<Court>();
        courts.add(new WimbledonCourt());
        courts.add(new AustraliaOpenCourt());
        courts.add(new RolandGarrosCourt());

        for(Court court: courts){
            court.cutGrass();
        }
    }
}
