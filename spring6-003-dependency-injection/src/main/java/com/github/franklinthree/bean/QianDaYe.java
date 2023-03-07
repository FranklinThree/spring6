package com.github.franklinthree.bean;

import java.util.Arrays;

/**
 *
 *
 * @author FranklinThree
 * @date 2023/03/07
 * @className QianDaYe
 * @see
 * @since 1.0.0
 */
public class QianDaYe {
   private String[] aiHaos;

    @Override
    public String toString() {
        return "QianDaYe{" +
                "\n\t" + "aiHaos=" + Arrays.toString(aiHaos) +
                ",\n\t" + "women=" + Arrays.toString(women) +
                '\n' + '}';
    }

    public Woman[] getWomen() {
        return women;
    }

    public void setWomen(Woman[] women) {
        this.women = women;
    }

    private Woman[] women;

    public String[] getAiHaos() {
        return aiHaos;
    }

    public void setAiHaos(String[] aiHaos) {
        this.aiHaos = aiHaos;
    }
}
