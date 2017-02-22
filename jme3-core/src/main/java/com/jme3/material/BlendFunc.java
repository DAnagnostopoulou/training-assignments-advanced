package com.jme3.material;

/**
 * <code>BlendFunc</code> defines the blending functions for use with 
 * <code>BlendMode.Custom</code>.
 * Source color components are referred to as (R_s0, G_s0, B_s0, A_s0).
 * Destination color components are referred to as (R_d, G_d, B_d, A_d).
 */
public enum BlendFunc {
    /**
     * RGB Factor (0, 0, 0), Alpha Factor (0)
     */
    Zero,
    /**
     * RGB Factor (1, 1, 1), Alpha Factor (1)
     */
    One,
    /**
     * RGB Factor (R_s0, G_s0, B_s0), Alpha Factor (A_s0)
     */
    Src_Color,
    /**
     * RGB Factor (1-R_s0, 1-G_s0, 1-B_s0), Alpha Factor (1-A_s0)
     */
    One_Minus_Src_Color,
    /**
     * RGB Factor (R_d, G_d, B_d), Alpha Factor (A_d)
     */
    Dst_Color,
    /**
     * RGB Factor (1-R_d, 1-G_d, 1-B_d), Alpha Factor (1-A_d)
     */
    One_Minus_Dst_Color,
    /**
     * RGB Factor (A_s0, A_s0, A_s0), Alpha Factor (A_s0)
     */
    Src_Alpha,
    /**
     * RGB Factor (1-A_s0, 1-A_s0, 1-A_s0), Alpha Factor (1-A_s0)
     */
    One_Minus_Src_Alpha,
    /**
     * RGB Factor (A_d, A_d, A_d), Alpha Factor (A_d)
     */
    Dst_Alpha,
    /**
     * RGB Factor (1-A_d, 1-A_d, 1-A_d), Alpha Factor (1-A_d)
     */
    One_Minus_Dst_Alpha,
    /**
     * RGB Factor (i, i, i), Alpha Factor (1)
     */
    Src_Alpha_Saturate;
}