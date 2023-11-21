package com.etu1999.rojows.stats;

import java.util.List;

import com.etu1999.rojows.domain.Player;
import com.etu1999.rojows.domain.Statistics;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class PlayerStatistic {
    Player player;
    List<Statistics> statistics;
    int DREB;
    int OREB;
    int PF;
    int AST;
    int BLK;
    int STL;
    int FGM2;
    int FGA2;
    int FGM3;
    int FGA3;
    int FTA;
    int FTM;
    int TOV;

    public void fillAttribute(){
        for (Statistics statistic : statistics) {
            
        }
    }

    /**
     * Getting defensive rebond
     */
    public int getDREB(){      // Defensive rebond
        return 0;
    }
    /**
     * Getting offensive rebond
     */
    public int getOREB(){
        return 0;
    }

    /**
     * Player fool
     */
    public int getPF(){
        return 0;
    }

    public int getAST(){
        return 0;
    }
    /**
     * Block
     */
    public int getBLK(){
        return 0;
    }

    /**
     * get steal
     */
    public int getSTL(){
        return 0;
    }
    
}
