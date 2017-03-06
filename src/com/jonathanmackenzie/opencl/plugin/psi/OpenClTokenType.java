package com.jonathanmackenzie.opencl.plugin.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import com.jonathanmackenzie.opencl.plugin.OpenClLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by mack0242 on 3/03/17.
 */
public class OpenClTokenType extends IElementType {
    public OpenClTokenType(@NotNull @NonNls String debugName) {
        super(debugName, OpenClLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return OpenClTokenType.class.getOpenClName() + "." + super.toString();
    }
}
