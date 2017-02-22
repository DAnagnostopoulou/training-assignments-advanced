package com.jme3.material;

/**
 * <code>BlendEquation</code> specifies the blending equation to combine
 * pixels.
 */
public enum BlendEquation {
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
     * Sets the blend equation so that each component of the result color is
     * the minimum of the corresponding components of the source and
     * destination colors. This and Max are useful for applications that
     * analyze image data (image thresholding against a constant color, for
     * example). Falls back to Add if supportsMinMax is false.
     */
    Min,
    /**
     * Sets the blend equation so that each component of the result color is
     * the maximum of the corresponding components of the source and
     * destination colors. This and Min are useful for applications that
     * analyze image data (image thresholding against a constant color, for
     * example). Falls back to Add if supportsMinMax is false.
     */
    Max
}