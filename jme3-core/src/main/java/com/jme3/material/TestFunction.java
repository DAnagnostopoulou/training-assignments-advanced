package com.jme3.material;

/**
 * <code>TestFunction</code> specifies the testing function for stencil test
 * function.
 *
 * <p>
 * The reference value given in the stencil command is the input value while
 * the reference is the value already in the stencil buffer.
 */
public enum TestFunction {

    /**
     * The test always fails
     */
    Never,
    /**
     * The test succeeds if the input value is equal to the reference value.
     */
    Equal,
    /**
     * The test succeeds if the input value is less than the reference value.
     */
    Less,
    /**
     * The test succeeds if the input value is less than or equal to
     * the reference value.
     */
    LessOrEqual,
    /**
     * The test succeeds if the input value is greater than the reference value.
     */
    Greater,
    /**
     * The test succeeds if the input value is greater than or equal to
     * the reference value.
     */
    GreaterOrEqual,
    /**
     * The test succeeds if the input value does not equal the
     * reference value.
     */
    NotEqual,
    /**
     * The test always passes
     */
    Always
}