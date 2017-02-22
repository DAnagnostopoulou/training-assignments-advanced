package com.jme3.material;

/**
 * <code>FaceCullMode</code> specifies the criteria for faces to be culled.
 *
 * @see RenderState#setFaceCullMode(com.jme3.material.RenderState.FaceCullMode)
 */
public enum FaceCullMode {

    /**
     * Face culling is disabled.
     */
    Off,
    /**
     * Cull front faces
     */
    Front,
    /**
     * Cull back faces
     */
    Back,
    /**
     * Cull both front and back faces.
     */
    FrontAndBack
}