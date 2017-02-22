package com.jme3.material;

/**
 * <code>StencilOperation</code> specifies the stencil operation to use
 * in a certain scenario as specified in {@link RenderState#setStencil(boolean,
 * com.jme3.material.RenderState.StencilOperation,
 * com.jme3.material.RenderState.StencilOperation,
 * com.jme3.material.RenderState.StencilOperation,
 * com.jme3.material.RenderState.StencilOperation,
 * com.jme3.material.RenderState.StencilOperation,
 * com.jme3.material.RenderState.StencilOperation,
 * com.jme3.material.RenderState.TestFunction,
 * com.jme3.material.RenderState.TestFunction) }
 */
public enum StencilOperation {

    /**
     * Keep the current value.
     */
    Keep,
    /**
     * Set the value to 0
     */
    Zero,
    /**
     * Replace the value in the stencil buffer with the reference value.
     */
    Replace,
    /**
     * Increment the value in the stencil buffer, clamp once reaching
     * the maximum value.
     */
    Increment,
    /**
     * Increment the value in the stencil buffer and wrap to 0 when
     * reaching the maximum value.
     */
    IncrementWrap,
    /**
     * Decrement the value in the stencil buffer and clamp once reaching 0.
     */
    Decrement,
    /**
     * Decrement the value in the stencil buffer and wrap to the maximum
     * value when reaching 0.
     */
    DecrementWrap,
    /**
     * Does a bitwise invert of the value in the stencil buffer.
     */
    Invert
}