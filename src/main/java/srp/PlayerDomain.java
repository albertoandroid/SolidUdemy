package srp;

public class PlayerDomain {

    Double winPercentage(Player player){
        return Double.valueOf(player.getWin()/(player.getWin()+player.getLose()));
    }

    Double lossPercentage(Player player){
        return 0.0;
    }
}
