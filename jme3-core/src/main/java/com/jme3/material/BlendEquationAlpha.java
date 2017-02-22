package com.jme3.material;

/**
 * <code>BlendEquationAlpha</code> specifies the blending equation to
 * combine pixels for the alpha component.
 */
public enum BlendEquationAlpha {
    /**
     * Sets the blend equation to be the same as the one defined by
     * {@link #blendEquation}.
     *
     */
    InheritColor,
    /**
     * Sets the blend equation so that the source and destination data are
     * added. (Default) Clamps to [0,1] Useful for things like antialiasing
     * and transparency.
     */
    Add,
    /**
     * Sets the blend equation so that the source and destination data are
     * subtracted (Src - Dest). Clamps to [0,1] Falls back to Add if
     * supportsSubtract is false.
     */
    Subtract,
    /**
     * Same as Subtract, but the order is reversed (Dst - Src). Clamps to
     * [0,1] Falls back to Add if supportsSubtract is false.
     */
    ReverseSubtract,
    /**
     * Sets the blend equation so that the result alpha is the minimum of
     * the source alpha and destination alpha. This and Max are useful for
     * applications that analyze image data (image thresholding against a
     * constant color, for example). Falls back to Add if supportsMinMax is
     * false.
     */
    Min,
    /**
     * sSets the blend equation so that the result alpha is the maximum of
     * the source alpha and destination alpha. This and Min are useful for
     * applications that analyze image data (image thresholding against a
     * constant color, for example). Falls back to Add if supportsMinMax is
     * false.
     */
    Max
}