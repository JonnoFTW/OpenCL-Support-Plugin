package com.jonathanmackenzie.opencl.plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.jonathanmackenzie.opencl.plugin.OpenClLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * Created by mack0242 on 3/03/17.
 */
public class OpenClElementType extends IElementType {
    public OpenClElementType(@NotNull @NonNls String debugName) {
        super(debugName, OpenClLanguage.INSTANCE);
    }
}
