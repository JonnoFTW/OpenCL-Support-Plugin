package com.jonathanmackenzie.opencl.plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static com.jonathanmackenzie.opencl.plugin.psi.OpenClTypes.*;

%%

%{
  public _OpenClLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _OpenClLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+


%%
<YYINITIAL> {
  {WHITE_SPACE}          { return WHITE_SPACE; }

  "id"                   { return ID; }
  "string"               { return STRING; }
  "int_const"            { return INT_CONST; }
  "char_const"           { return CHAR_CONST; }
  "float_const"          { return FLOAT_CONST; }
  "enumeration_const"    { return ENUMERATION_CONST; }


}

[^] { return BAD_CHARACTER; }
