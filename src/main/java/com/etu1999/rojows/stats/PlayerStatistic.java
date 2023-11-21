package com.etu1999.rojows.stats;

import java.util.List;

import com.etu1999.rojows.domain.Player;
import com.etu1999.rojows.domain.Statistics;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class PlayerStatistic {
    // List<Statistics> statistics;
    Player player = null;
    int DREB = 0;
    int OREB = 0;
    int PF = 0;
    int AST = 0;
    int BLK = 0;
    int STL = 0;
    int FGM2 = 0;
    int FGA2 = 0;
    int FGM3 = 0;
    int FGA3 = 0;
    int FTA = 0;
    int FTM = 0;
    int TOV = 0;

    public static PlayerStatistic createAttribute(List<Statistics> statistics){
        PlayerStatistic ps = new PlayerStatistic();
        for (Statistics statistic : statistics) {
            switch (statistic.getAction().getId()) {
                case "DREB":
                    ps.DREB++;
                    break;
                case "OREB":
                    ps.OREB++;
                    break;
                case "PF":
                    ps.PF++;
                    break;
                case "AST":
                    ps.AST++;
                    break;
                case "BLK":
                    // Increment the block (BLK) statistic
                    ps.BLK++;
                    break;
                case "STL":
                    // Increment the steal (STL) statistic
                    ps.STL++;
                    break;
                case "FGM2":
                    // Increment the field goals made (FGM2) for two-pointers
                    ps.FGM2++;
                    break;
                case "FGA2":
                    // Increment the field goals attempted (FGA2) for two-pointers
                    ps.FGA2++;
                    break;
                case "FGM3":
                    // Increment the field goals made (FGM3) for three-pointers
                    ps.FGM3++;
                    break;
                case "FGA3":
                    // Increment the field goals attempted (FGA3) for three-pointers
                    ps.FGA3++;
                    break;
                case "FTA":
                    // Increment the free throws attempted (FTA)
                    ps.FTA++;
                    break;
                case "FTM":
                    // Increment the free throws made (FTM)
                    ps.FTM++;
                    break;
                case "TOV":
                    // Increment the turnover (TOV) statistic
                    ps.TOV++;
                default:
                    break;
                }
            }
        return ps;
    }
    
}
