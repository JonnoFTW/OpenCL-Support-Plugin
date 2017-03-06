// This is a generated file. Not intended for manual editing.
package com.jonathanmackenzie.opencl.plugin;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.jonathanmackenzie.opencl.plugin.psi.OpenClTypes.*;
import static com.jonathanmackenzie.opencl.plugin.OpenClParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class OpenClParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ABSTRACT_DECLARATOR) {
      r = abstract_declarator(b, 0);
    }
    else if (t == ADDITIVE_EXP) {
      r = additive_exp(b, 0);
    }
    else if (t == AND_EXP) {
      r = and_exp(b, 0);
    }
    else if (t == ARGUMENT_EXP_LIST) {
      r = argument_exp_list(b, 0);
    }
    else if (t == ASSIGNMENT_EXP) {
      r = assignment_exp(b, 0);
    }
    else if (t == ASSIGNMENT_OPERATOR) {
      r = assignment_operator(b, 0);
    }
    else if (t == CAST_EXP) {
      r = cast_exp(b, 0);
    }
    else if (t == COMPOUND_STAT) {
      r = compound_stat(b, 0);
    }
    else if (t == CONDITIONAL_EXP) {
      r = conditional_exp(b, 0);
    }
    else if (t == CONST) {
      r = consumeToken(b, CONST_$);
    }
    else if (t == CONST_EXP) {
      r = const_exp(b, 0);
    }
    else if (t == DECL) {
      r = decl(b, 0);
    }
    else if (t == DECL_LIST) {
      r = decl_list(b, 0);
    }
    else if (t == DECL_SPECS) {
      r = decl_specs(b, 0);
    }
    else if (t == DECLARATOR) {
      r = declarator(b, 0);
    }
    else if (t == DIRECT_ABSTRACT_DECLARATOR) {
      r = direct_abstract_declarator(b, 0);
    }
    else if (t == DIRECT_DECLARATOR) {
      r = direct_declarator(b, 0);
    }
    else if (t == ENUM_SPEC) {
      r = enum_spec(b, 0);
    }
    else if (t == ENUMERATOR) {
      r = enumerator(b, 0);
    }
    else if (t == ENUMERATOR_LIST) {
      r = enumerator_list(b, 0);
    }
    else if (t == EQUALITY_EXP) {
      r = equality_exp(b, 0);
    }
    else if (t == EXCLUSIVE_OR_EXP) {
      r = exclusive_or_exp(b, 0);
    }
    else if (t == EXP) {
      r = exp(b, 0);
    }
    else if (t == EXP_STAT) {
      r = exp_stat(b, 0);
    }
    else if (t == EXTERNAL_DECL) {
      r = external_decl(b, 0);
    }
    else if (t == FUNCTION_DEFINITION) {
      r = function_definition(b, 0);
    }
    else if (t == ID_LIST) {
      r = id_list(b, 0);
    }
    else if (t == INCLUSIVE_OR_EXP) {
      r = inclusive_or_exp(b, 0);
    }
    else if (t == INIT_DECLARATOR) {
      r = init_declarator(b, 0);
    }
    else if (t == INIT_DECLARATOR_LIST) {
      r = init_declarator_list(b, 0);
    }
    else if (t == INITIALIZER) {
      r = initializer(b, 0);
    }
    else if (t == INITIALIZER_LIST) {
      r = initializer_list(b, 0);
    }
    else if (t == ITERATION_STAT) {
      r = iteration_stat(b, 0);
    }
    else if (t == JUMP_STAT) {
      r = jump_stat(b, 0);
    }
    else if (t == LABELED_STAT) {
      r = labeled_stat(b, 0);
    }
    else if (t == LOGICAL_AND_EXP) {
      r = logical_and_exp(b, 0);
    }
    else if (t == LOGICAL_OR_EXP) {
      r = logical_or_exp(b, 0);
    }
    else if (t == MEMORY_SPEC) {
      r = memory_spec(b, 0);
    }
    else if (t == MULT_EXP) {
      r = mult_exp(b, 0);
    }
    else if (t == PARAM_DECL) {
      r = param_decl(b, 0);
    }
    else if (t == PARAM_LIST) {
      r = param_list(b, 0);
    }
    else if (t == PARAM_TYPE_LIST) {
      r = param_type_list(b, 0);
    }
    else if (t == POINTER) {
      r = pointer(b, 0);
    }
    else if (t == POSTFIX_EXP) {
      r = postfix_exp(b, 0);
    }
    else if (t == PRIMARY_EXP) {
      r = primary_exp(b, 0);
    }
    else if (t == RELATIONAL_EXP) {
      r = relational_exp(b, 0);
    }
    else if (t == SELECTION_STAT) {
      r = selection_stat(b, 0);
    }
    else if (t == SHIFT_EXPRESSION) {
      r = shift_expression(b, 0);
    }
    else if (t == SPEC_QUALIFIER_LIST) {
      r = spec_qualifier_list(b, 0);
    }
    else if (t == STAT) {
      r = stat(b, 0);
    }
    else if (t == STAT_LIST) {
      r = stat_list(b, 0);
    }
    else if (t == STORAGE_CLASS_SPEC) {
      r = storage_class_spec(b, 0);
    }
    else if (t == STRUCT_DECL) {
      r = struct_decl(b, 0);
    }
    else if (t == STRUCT_DECL_LIST) {
      r = struct_decl_list(b, 0);
    }
    else if (t == STRUCT_DECLARATOR) {
      r = struct_declarator(b, 0);
    }
    else if (t == STRUCT_DECLARATOR_LIST) {
      r = struct_declarator_list(b, 0);
    }
    else if (t == STRUCT_OR_UNION) {
      r = struct_or_union(b, 0);
    }
    else if (t == STRUCT_OR_UNION_SPEC) {
      r = struct_or_union_spec(b, 0);
    }
    else if (t == TYPE_NAME) {
      r = type_name(b, 0);
    }
    else if (t == TYPE_QUALIFIER) {
      r = type_qualifier(b, 0);
    }
    else if (t == TYPE_QUALIFIER_LIST) {
      r = type_qualifier_list(b, 0);
    }
    else if (t == TYPE_SPEC) {
      r = type_spec(b, 0);
    }
    else if (t == TYPEDEF_NAME) {
      r = typedef_name(b, 0);
    }
    else if (t == UNARY_EXP) {
      r = unary_exp(b, 0);
    }
    else if (t == UNARY_OPERATOR) {
      r = unary_operator(b, 0);
    }
    else if (t == VECTOR_SIZE) {
      r = vector_size(b, 0);
    }
    else if (t == VECTOR_TYPE) {
      r = vector_type(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return translation_unit(b, l + 1);
  }

  /* ********************************************************** */
  // pointer
  // 			| pointer direct_abstract_declarator
  // 			|	direct_abstract_declarator
  public static boolean abstract_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ABSTRACT_DECLARATOR, "<abstract declarator>");
    r = pointer(b, l + 1);
    if (!r) r = abstract_declarator_1(b, l + 1);
    if (!r) r = direct_abstract_declarator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pointer direct_abstract_declarator
  private static boolean abstract_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "abstract_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pointer(b, l + 1);
    r = r && direct_abstract_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // mult_exp
  // 			| additive_exp '+' mult_exp
  // 			| additive_exp '-' mult_exp
  public static boolean additive_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ADDITIVE_EXP, "<additive exp>");
    r = mult_exp(b, l + 1);
    if (!r) r = additive_exp_1(b, l + 1);
    if (!r) r = additive_exp_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // additive_exp '+' mult_exp
  private static boolean additive_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additive_exp(b, l + 1);
    r = r && consumeToken(b, "+");
    r = r && mult_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // additive_exp '-' mult_exp
  private static boolean additive_exp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "additive_exp_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = additive_exp(b, l + 1);
    r = r && consumeToken(b, "-");
    r = r && mult_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // equality_exp
  // 			| and_exp '&' equality_exp
  public static boolean and_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_EXP, "<and exp>");
    r = equality_exp(b, l + 1);
    if (!r) r = and_exp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // and_exp '&' equality_exp
  private static boolean and_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "and_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = and_exp(b, l + 1);
    r = r && consumeToken(b, "&");
    r = r && equality_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assignment_exp
  // 			| argument_exp_list ',' assignment_exp
  public static boolean argument_exp_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_exp_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARGUMENT_EXP_LIST, "<argument exp list>");
    r = assignment_exp(b, l + 1);
    if (!r) r = argument_exp_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // argument_exp_list ',' assignment_exp
  private static boolean argument_exp_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argument_exp_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = argument_exp_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && assignment_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // conditional_exp
  // 			| unary_exp assignment_operator assignment_exp
  public static boolean assignment_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_EXP, "<assignment exp>");
    r = conditional_exp(b, l + 1);
    if (!r) r = assignment_exp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // unary_exp assignment_operator assignment_exp
  private static boolean assignment_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_exp(b, l + 1);
    r = r && assignment_operator(b, l + 1);
    r = r && assignment_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<='
  // 			| '>>=' | '&=' | '^=' | '|='
  public static boolean assignment_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_OPERATOR, "<assignment operator>");
    r = consumeToken(b, "=");
    if (!r) r = consumeToken(b, "*=");
    if (!r) r = consumeToken(b, "/=");
    if (!r) r = consumeToken(b, "%=");
    if (!r) r = consumeToken(b, "+=");
    if (!r) r = consumeToken(b, "-=");
    if (!r) r = consumeToken(b, "<<=");
    if (!r) r = consumeToken(b, ">>=");
    if (!r) r = consumeToken(b, "&=");
    if (!r) r = consumeToken(b, "^=");
    if (!r) r = consumeToken(b, "|=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // unary_exp
  // 			| '(' type_name ')' cast_exp
  public static boolean cast_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CAST_EXP, "<cast exp>");
    r = unary_exp(b, l + 1);
    if (!r) r = cast_exp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' type_name ')' cast_exp
  private static boolean cast_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cast_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && type_name(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && cast_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' decl_list stat_list '}'
  // 			| '{'		stat_list '}'
  // 			| '{' decl_list		'}'
  // 			| '{'			'}'
  public static boolean compound_stat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_stat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPOUND_STAT, "<compound stat>");
    r = compound_stat_0(b, l + 1);
    if (!r) r = compound_stat_1(b, l + 1);
    if (!r) r = compound_stat_2(b, l + 1);
    if (!r) r = compound_stat_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '{' decl_list stat_list '}'
  private static boolean compound_stat_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_stat_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && decl_list(b, l + 1);
    r = r && stat_list(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // '{'		stat_list '}'
  private static boolean compound_stat_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_stat_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && stat_list(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' decl_list		'}'
  private static boolean compound_stat_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_stat_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && decl_list(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // '{'			'}'
  private static boolean compound_stat_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compound_stat_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // logical_or_exp
  // 			| logical_or_exp '?' exp ':' conditional_exp
  public static boolean conditional_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITIONAL_EXP, "<conditional exp>");
    r = logical_or_exp(b, l + 1);
    if (!r) r = conditional_exp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // logical_or_exp '?' exp ':' conditional_exp
  private static boolean conditional_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditional_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = logical_or_exp(b, l + 1);
    r = r && consumeToken(b, "?");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && conditional_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // int_const
  // 			| char_const
  // 			| float_const
  // 			| enumeration_const
  public static boolean const_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_$")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST, "<const>");
    r = consumeToken(b, INT_CONST);
    if (!r) r = consumeToken(b, CHAR_CONST);
    if (!r) r = consumeToken(b, FLOAT_CONST);
    if (!r) r = consumeToken(b, ENUMERATION_CONST);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // conditional_exp
  public static boolean const_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "const_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONST_EXP, "<const exp>");
    r = conditional_exp(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // decl_specs init_declarator_list ';'
  // 			| decl_specs			';'
  public static boolean decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL, "<decl>");
    r = decl_0(b, l + 1);
    if (!r) r = decl_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // decl_specs init_declarator_list ';'
  private static boolean decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_specs(b, l + 1);
    r = r && init_declarator_list(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // decl_specs			';'
  private static boolean decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_specs(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decl
  // 			| decl_list decl
  public static boolean decl_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_LIST, "<decl list>");
    r = decl(b, l + 1);
    if (!r) r = decl_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // decl_list decl
  private static boolean decl_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_list(b, l + 1);
    r = r && decl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // storage_class_spec decl_specs
  // 			| storage_class_spec
  // 			| type_spec decl_specs
  // 			| type_spec
  // 			| type_qualifier decl_specs
  // 			| type_qualifier
  // 			| '__kernel' decl_specs
  public static boolean decl_specs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_specs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECL_SPECS, "<decl specs>");
    r = decl_specs_0(b, l + 1);
    if (!r) r = storage_class_spec(b, l + 1);
    if (!r) r = decl_specs_2(b, l + 1);
    if (!r) r = type_spec(b, l + 1);
    if (!r) r = decl_specs_4(b, l + 1);
    if (!r) r = type_qualifier(b, l + 1);
    if (!r) r = decl_specs_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // storage_class_spec decl_specs
  private static boolean decl_specs_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_specs_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = storage_class_spec(b, l + 1);
    r = r && decl_specs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_spec decl_specs
  private static boolean decl_specs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_specs_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_spec(b, l + 1);
    r = r && decl_specs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_qualifier decl_specs
  private static boolean decl_specs_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_specs_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_qualifier(b, l + 1);
    r = r && decl_specs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '__kernel' decl_specs
  private static boolean decl_specs_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "decl_specs_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "__kernel");
    r = r && decl_specs(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // pointer direct_declarator
  // 			|	direct_declarator
  public static boolean declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATOR, "<declarator>");
    r = declarator_0(b, l + 1);
    if (!r) r = direct_declarator(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // pointer direct_declarator
  private static boolean declarator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pointer(b, l + 1);
    r = r && direct_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '(' abstract_declarator ')'
  // 			| direct_abstract_declarator '[' const_exp ']'
  // 			|				'[' const_exp ']'
  // 			| direct_abstract_declarator '['	']'
  // 			|				'['	']'
  // 			| direct_abstract_declarator '(' param_type_list ')'
  // 			|				'(' param_type_list ')'
  // 			| direct_abstract_declarator '('		')'
  // 			|				'('		')'
  public static boolean direct_abstract_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_abstract_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECT_ABSTRACT_DECLARATOR, "<direct abstract declarator>");
    r = direct_abstract_declarator_0(b, l + 1);
    if (!r) r = direct_abstract_declarator_1(b, l + 1);
    if (!r) r = direct_abstract_declarator_2(b, l + 1);
    if (!r) r = direct_abstract_declarator_3(b, l + 1);
    if (!r) r = direct_abstract_declarator_4(b, l + 1);
    if (!r) r = direct_abstract_declarator_5(b, l + 1);
    if (!r) r = direct_abstract_declarator_6(b, l + 1);
    if (!r) r = direct_abstract_declarator_7(b, l + 1);
    if (!r) r = direct_abstract_declarator_8(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' abstract_declarator ')'
  private static boolean direct_abstract_declarator_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_abstract_declarator_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && abstract_declarator(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // direct_abstract_declarator '[' const_exp ']'
  private static boolean direct_abstract_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_abstract_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = direct_abstract_declarator(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && const_exp(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // '[' const_exp ']'
  private static boolean direct_abstract_declarator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_abstract_declarator_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && const_exp(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // direct_abstract_declarator '['	']'
  private static boolean direct_abstract_declarator_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_abstract_declarator_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = direct_abstract_declarator(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // '['	']'
  private static boolean direct_abstract_declarator_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_abstract_declarator_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "[");
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // direct_abstract_declarator '(' param_type_list ')'
  private static boolean direct_abstract_declarator_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_abstract_declarator_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = direct_abstract_declarator(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && param_type_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '(' param_type_list ')'
  private static boolean direct_abstract_declarator_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_abstract_declarator_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && param_type_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // direct_abstract_declarator '('		')'
  private static boolean direct_abstract_declarator_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_abstract_declarator_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = direct_abstract_declarator(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // '('		')'
  private static boolean direct_abstract_declarator_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_abstract_declarator_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id
  // 			| '(' declarator ')'
  // 			| direct_declarator '[' const_exp ']'
  // 			| direct_declarator '['		']'
  // 			| direct_declarator '(' param_type_list ')'
  // 			| direct_declarator '(' id_list ')'
  // 			| direct_declarator '('		')'
  public static boolean direct_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECT_DECLARATOR, "<direct declarator>");
    r = consumeToken(b, ID);
    if (!r) r = direct_declarator_1(b, l + 1);
    if (!r) r = direct_declarator_2(b, l + 1);
    if (!r) r = direct_declarator_3(b, l + 1);
    if (!r) r = direct_declarator_4(b, l + 1);
    if (!r) r = direct_declarator_5(b, l + 1);
    if (!r) r = direct_declarator_6(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' declarator ')'
  private static boolean direct_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && declarator(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // direct_declarator '[' const_exp ']'
  private static boolean direct_declarator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_declarator_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = direct_declarator(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && const_exp(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // direct_declarator '['		']'
  private static boolean direct_declarator_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_declarator_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = direct_declarator(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // direct_declarator '(' param_type_list ')'
  private static boolean direct_declarator_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_declarator_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = direct_declarator(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && param_type_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // direct_declarator '(' id_list ')'
  private static boolean direct_declarator_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_declarator_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = direct_declarator(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && id_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // direct_declarator '('		')'
  private static boolean direct_declarator_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "direct_declarator_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = direct_declarator(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'enum' id '{' enumerator_list '}'
  // 			| 'enum'	'{' enumerator_list '}'
  // 			| 'enum' id
  public static boolean enum_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ENUM_SPEC, "<enum spec>");
    r = enum_spec_0(b, l + 1);
    if (!r) r = enum_spec_1(b, l + 1);
    if (!r) r = enum_spec_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'enum' id '{' enumerator_list '}'
  private static boolean enum_spec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_spec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "enum");
    r = r && consumeToken(b, ID);
    r = r && consumeToken(b, "{");
    r = r && enumerator_list(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'enum'	'{' enumerator_list '}'
  private static boolean enum_spec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_spec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "enum");
    r = r && consumeToken(b, "{");
    r = r && enumerator_list(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'enum' id
  private static boolean enum_spec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_spec_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "enum");
    r = r && consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id
  // 			| id '=' const_exp
  public static boolean enumerator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    if (!r) r = enumerator_1(b, l + 1);
    exit_section_(b, m, ENUMERATOR, r);
    return r;
  }

  // id '=' const_exp
  private static boolean enumerator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && consumeToken(b, "=");
    r = r && const_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // enumerator
  // 			| enumerator_list ',' enumerator
  public static boolean enumerator_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator_list")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumerator(b, l + 1);
    if (!r) r = enumerator_list_1(b, l + 1);
    exit_section_(b, m, ENUMERATOR_LIST, r);
    return r;
  }

  // enumerator_list ',' enumerator
  private static boolean enumerator_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumerator_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumerator_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && enumerator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // relational_exp
  // 			| equality_exp '==' relational_exp
  // 			| equality_exp '!=' relational_exp
  public static boolean equality_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUALITY_EXP, "<equality exp>");
    r = relational_exp(b, l + 1);
    if (!r) r = equality_exp_1(b, l + 1);
    if (!r) r = equality_exp_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // equality_exp '==' relational_exp
  private static boolean equality_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equality_exp(b, l + 1);
    r = r && consumeToken(b, "==");
    r = r && relational_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // equality_exp '!=' relational_exp
  private static boolean equality_exp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equality_exp_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = equality_exp(b, l + 1);
    r = r && consumeToken(b, "!=");
    r = r && relational_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // and_exp
  // 			| exclusive_or_exp '^' and_exp
  public static boolean exclusive_or_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclusive_or_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXCLUSIVE_OR_EXP, "<exclusive or exp>");
    r = and_exp(b, l + 1);
    if (!r) r = exclusive_or_exp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // exclusive_or_exp '^' and_exp
  private static boolean exclusive_or_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exclusive_or_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exclusive_or_exp(b, l + 1);
    r = r && consumeToken(b, "^");
    r = r && and_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assignment_exp
  // 			| exp ',' assignment_exp
  public static boolean exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXP, "<exp>");
    r = assignment_exp(b, l + 1);
    if (!r) r = exp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // exp ',' assignment_exp
  private static boolean exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exp(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && assignment_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // exp ';'
  // 			|	';'
  public static boolean exp_stat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp_stat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXP_STAT, "<exp stat>");
    r = exp_stat_0(b, l + 1);
    if (!r) r = consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // exp ';'
  private static boolean exp_stat_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "exp_stat_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = exp(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // function_definition
  // 			| decl
  public static boolean external_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "external_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EXTERNAL_DECL, "<external decl>");
    r = function_definition(b, l + 1);
    if (!r) r = decl(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // decl_specs declarator decl_list compound_stat
  // 			|		declarator decl_list compound_stat
  // 			| decl_specs declarator		compound_stat
  // 			|		declarator 	compound_stat
  public static boolean function_definition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_definition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_DEFINITION, "<function definition>");
    r = function_definition_0(b, l + 1);
    if (!r) r = function_definition_1(b, l + 1);
    if (!r) r = function_definition_2(b, l + 1);
    if (!r) r = function_definition_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // decl_specs declarator decl_list compound_stat
  private static boolean function_definition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_definition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_specs(b, l + 1);
    r = r && declarator(b, l + 1);
    r = r && decl_list(b, l + 1);
    r = r && compound_stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // declarator decl_list compound_stat
  private static boolean function_definition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_definition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declarator(b, l + 1);
    r = r && decl_list(b, l + 1);
    r = r && compound_stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // decl_specs declarator		compound_stat
  private static boolean function_definition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_definition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_specs(b, l + 1);
    r = r && declarator(b, l + 1);
    r = r && compound_stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // declarator 	compound_stat
  private static boolean function_definition_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function_definition_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declarator(b, l + 1);
    r = r && compound_stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id
  // 			| id_list ',' id
  public static boolean id_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_list")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    if (!r) r = id_list_1(b, l + 1);
    exit_section_(b, m, ID_LIST, r);
    return r;
  }

  // id_list ',' id
  private static boolean id_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = id_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // exclusive_or_exp
  // 			| inclusive_or_exp '|' exclusive_or_exp
  public static boolean inclusive_or_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inclusive_or_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCLUSIVE_OR_EXP, "<inclusive or exp>");
    r = exclusive_or_exp(b, l + 1);
    if (!r) r = inclusive_or_exp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // inclusive_or_exp '|' exclusive_or_exp
  private static boolean inclusive_or_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inclusive_or_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inclusive_or_exp(b, l + 1);
    r = r && consumeToken(b, "|");
    r = r && exclusive_or_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // declarator
  // 			| declarator '=' initializer
  public static boolean init_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INIT_DECLARATOR, "<init declarator>");
    r = declarator(b, l + 1);
    if (!r) r = init_declarator_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // declarator '=' initializer
  private static boolean init_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declarator(b, l + 1);
    r = r && consumeToken(b, "=");
    r = r && initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // init_declarator
  // 			| init_declarator_list ',' init_declarator
  public static boolean init_declarator_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_declarator_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INIT_DECLARATOR_LIST, "<init declarator list>");
    r = init_declarator(b, l + 1);
    if (!r) r = init_declarator_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // init_declarator_list ',' init_declarator
  private static boolean init_declarator_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "init_declarator_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = init_declarator_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && init_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assignment_exp
  // 			| '{' initializer_list '}'
  // 			| '{' initializer_list ',' '}'
  public static boolean initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INITIALIZER, "<initializer>");
    r = assignment_exp(b, l + 1);
    if (!r) r = initializer_1(b, l + 1);
    if (!r) r = initializer_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '{' initializer_list '}'
  private static boolean initializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && initializer_list(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // '{' initializer_list ',' '}'
  private static boolean initializer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "{");
    r = r && initializer_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // initializer
  // 			| initializer_list ',' initializer
  public static boolean initializer_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INITIALIZER_LIST, "<initializer list>");
    r = initializer(b, l + 1);
    if (!r) r = initializer_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // initializer_list ',' initializer
  private static boolean initializer_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = initializer_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'while' '(' exp ')' stat
  // 			| 'do' stat 'while' '(' exp ')' ';'
  // 			| 'for' '(' exp ';' exp ';' exp ')' stat
  // 			| 'for' '(' exp ';' exp ';'	')' stat
  // 			| 'for' '(' exp ';'	';' exp ')' stat
  // 			| 'for' '(' exp ';'	';'	')' stat
  // 			| 'for' '('	';' exp ';' exp ')' stat
  // 			| 'for' '('	';' exp ';'	')' stat
  // 			| 'for' '('	';'	';' exp ')' stat
  // 			| 'for' '('	';'	';'	')' stat
  public static boolean iteration_stat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_stat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITERATION_STAT, "<iteration stat>");
    r = iteration_stat_0(b, l + 1);
    if (!r) r = iteration_stat_1(b, l + 1);
    if (!r) r = iteration_stat_2(b, l + 1);
    if (!r) r = iteration_stat_3(b, l + 1);
    if (!r) r = iteration_stat_4(b, l + 1);
    if (!r) r = iteration_stat_5(b, l + 1);
    if (!r) r = iteration_stat_6(b, l + 1);
    if (!r) r = iteration_stat_7(b, l + 1);
    if (!r) r = iteration_stat_8(b, l + 1);
    if (!r) r = iteration_stat_9(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'while' '(' exp ')' stat
  private static boolean iteration_stat_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_stat_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "while");
    r = r && consumeToken(b, "(");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'do' stat 'while' '(' exp ')' ';'
  private static boolean iteration_stat_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_stat_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "do");
    r = r && stat(b, l + 1);
    r = r && consumeToken(b, "while");
    r = r && consumeToken(b, "(");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'for' '(' exp ';' exp ';' exp ')' stat
  private static boolean iteration_stat_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_stat_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "for");
    r = r && consumeToken(b, "(");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'for' '(' exp ';' exp ';'	')' stat
  private static boolean iteration_stat_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_stat_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "for");
    r = r && consumeToken(b, "(");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, ")");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'for' '(' exp ';'	';' exp ')' stat
  private static boolean iteration_stat_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_stat_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "for");
    r = r && consumeToken(b, "(");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, ";");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'for' '(' exp ';'	';'	')' stat
  private static boolean iteration_stat_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_stat_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "for");
    r = r && consumeToken(b, "(");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, ")");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'for' '('	';' exp ';' exp ')' stat
  private static boolean iteration_stat_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_stat_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "for");
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, ";");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'for' '('	';' exp ';'	')' stat
  private static boolean iteration_stat_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_stat_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "for");
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, ";");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, ")");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'for' '('	';'	';' exp ')' stat
  private static boolean iteration_stat_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_stat_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "for");
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, ";");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'for' '('	';'	';'	')' stat
  private static boolean iteration_stat_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "iteration_stat_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "for");
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, ";");
    r = r && consumeToken(b, ")");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'continue' ';'
  // 			| 'break' ';'
  // 			| 'return' exp ';'
  // 			| 'return'	';'
  public static boolean jump_stat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_stat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, JUMP_STAT, "<jump stat>");
    r = jump_stat_0(b, l + 1);
    if (!r) r = jump_stat_1(b, l + 1);
    if (!r) r = jump_stat_2(b, l + 1);
    if (!r) r = jump_stat_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'continue' ';'
  private static boolean jump_stat_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_stat_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "continue");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'break' ';'
  private static boolean jump_stat_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_stat_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "break");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'return' exp ';'
  private static boolean jump_stat_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_stat_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "return");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  // 'return'	';'
  private static boolean jump_stat_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jump_stat_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "return");
    r = r && consumeToken(b, ";");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id ':' stat
  // 			| 'case' const_exp ':' stat
  // 			| 'default' ':' stat
  public static boolean labeled_stat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labeled_stat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LABELED_STAT, "<labeled stat>");
    r = labeled_stat_0(b, l + 1);
    if (!r) r = labeled_stat_1(b, l + 1);
    if (!r) r = labeled_stat_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // id ':' stat
  private static boolean labeled_stat_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labeled_stat_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    r = r && consumeToken(b, ":");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'case' const_exp ':' stat
  private static boolean labeled_stat_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labeled_stat_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "case");
    r = r && const_exp(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'default' ':' stat
  private static boolean labeled_stat_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labeled_stat_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "default");
    r = r && consumeToken(b, ":");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // inclusive_or_exp
  // 			| logical_and_exp '&&' inclusive_or_exp
  public static boolean logical_and_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_and_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_AND_EXP, "<logical and exp>");
    r = inclusive_or_exp(b, l + 1);
    if (!r) r = logical_and_exp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // logical_and_exp '&&' inclusive_or_exp
  private static boolean logical_and_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_and_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = logical_and_exp(b, l + 1);
    r = r && consumeToken(b, "&&");
    r = r && inclusive_or_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // logical_and_exp
  // 			| logical_or_exp '||' logical_and_exp
  public static boolean logical_or_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_or_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LOGICAL_OR_EXP, "<logical or exp>");
    r = logical_and_exp(b, l + 1);
    if (!r) r = logical_or_exp_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // logical_or_exp '||' logical_and_exp
  private static boolean logical_or_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "logical_or_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = logical_or_exp(b, l + 1);
    r = r && consumeToken(b, "||");
    r = r && logical_and_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '__global' | 'global' | '__private' | 'private' | '__local' | 'local'
  public static boolean memory_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memory_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMORY_SPEC, "<memory spec>");
    r = consumeToken(b, "__global");
    if (!r) r = consumeToken(b, "global");
    if (!r) r = consumeToken(b, "__private");
    if (!r) r = consumeToken(b, "private");
    if (!r) r = consumeToken(b, "__local");
    if (!r) r = consumeToken(b, "local");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // cast_exp
  // 			| mult_exp '*' cast_exp
  // 			| mult_exp '/' cast_exp
  // 			| mult_exp '%' cast_exp
  public static boolean mult_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MULT_EXP, "<mult exp>");
    r = cast_exp(b, l + 1);
    if (!r) r = mult_exp_1(b, l + 1);
    if (!r) r = mult_exp_2(b, l + 1);
    if (!r) r = mult_exp_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // mult_exp '*' cast_exp
  private static boolean mult_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mult_exp(b, l + 1);
    r = r && consumeToken(b, "*");
    r = r && cast_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // mult_exp '/' cast_exp
  private static boolean mult_exp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_exp_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mult_exp(b, l + 1);
    r = r && consumeToken(b, "/");
    r = r && cast_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // mult_exp '%' cast_exp
  private static boolean mult_exp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mult_exp_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mult_exp(b, l + 1);
    r = r && consumeToken(b, "%");
    r = r && cast_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // decl_specs declarator
  // 			| decl_specs abstract_declarator
  // 			| decl_specs
  public static boolean param_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_DECL, "<param decl>");
    r = param_decl_0(b, l + 1);
    if (!r) r = param_decl_1(b, l + 1);
    if (!r) r = decl_specs(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // decl_specs declarator
  private static boolean param_decl_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_decl_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_specs(b, l + 1);
    r = r && declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // decl_specs abstract_declarator
  private static boolean param_decl_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_decl_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = decl_specs(b, l + 1);
    r = r && abstract_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // param_decl
  // 			| param_list ',' param_decl
  public static boolean param_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_LIST, "<param list>");
    r = param_decl(b, l + 1);
    if (!r) r = param_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // param_list ',' param_decl
  private static boolean param_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && param_decl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // param_list
  // 			| param_list ',' '...'
  public static boolean param_type_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_type_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAM_TYPE_LIST, "<param type list>");
    r = param_list(b, l + 1);
    if (!r) r = param_type_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // param_list ',' '...'
  private static boolean param_type_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "param_type_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = param_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && consumeToken(b, "...");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '*' type_qualifier_list
  // 			| '*'
  // 			| '*' type_qualifier_list pointer
  public static boolean pointer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pointer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POINTER, "<pointer>");
    r = pointer_0(b, l + 1);
    if (!r) r = consumeToken(b, "*");
    if (!r) r = pointer_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '*' type_qualifier_list
  private static boolean pointer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pointer_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    r = r && type_qualifier_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '*' type_qualifier_list pointer
  private static boolean pointer_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pointer_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "*");
    r = r && type_qualifier_list(b, l + 1);
    r = r && pointer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary_exp
  // 			| postfix_exp '[' exp ']'
  // 			| postfix_exp '(' argument_exp_list ')'
  // 			| postfix_exp '('			')'
  // 			| postfix_exp '.' id
  // 			| postfix_exp '->' id
  // 			| postfix_exp '++'
  // 			| postfix_exp '--'
  public static boolean postfix_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, POSTFIX_EXP, "<postfix exp>");
    r = primary_exp(b, l + 1);
    if (!r) r = postfix_exp_1(b, l + 1);
    if (!r) r = postfix_exp_2(b, l + 1);
    if (!r) r = postfix_exp_3(b, l + 1);
    if (!r) r = postfix_exp_4(b, l + 1);
    if (!r) r = postfix_exp_5(b, l + 1);
    if (!r) r = postfix_exp_6(b, l + 1);
    if (!r) r = postfix_exp_7(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // postfix_exp '[' exp ']'
  private static boolean postfix_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = postfix_exp(b, l + 1);
    r = r && consumeToken(b, "[");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, "]");
    exit_section_(b, m, null, r);
    return r;
  }

  // postfix_exp '(' argument_exp_list ')'
  private static boolean postfix_exp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_exp_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = postfix_exp(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && argument_exp_list(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // postfix_exp '('			')'
  private static boolean postfix_exp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_exp_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = postfix_exp(b, l + 1);
    r = r && consumeToken(b, "(");
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  // postfix_exp '.' id
  private static boolean postfix_exp_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_exp_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = postfix_exp(b, l + 1);
    r = r && consumeToken(b, ".");
    r = r && consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // postfix_exp '->' id
  private static boolean postfix_exp_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_exp_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = postfix_exp(b, l + 1);
    r = r && consumeToken(b, "->");
    r = r && consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  // postfix_exp '++'
  private static boolean postfix_exp_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_exp_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = postfix_exp(b, l + 1);
    r = r && consumeToken(b, "++");
    exit_section_(b, m, null, r);
    return r;
  }

  // postfix_exp '--'
  private static boolean postfix_exp_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postfix_exp_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = postfix_exp(b, l + 1);
    r = r && consumeToken(b, "--");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id
  // 			| const
  // 			| string
  // 			| '(' exp ')'
  public static boolean primary_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMARY_EXP, "<primary exp>");
    r = consumeToken(b, ID);
    if (!r) r = const_$(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = primary_exp_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '(' exp ')'
  private static boolean primary_exp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primary_exp_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "(");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // shift_expression
  // 			| relational_exp '<' shift_expression
  // 			| relational_exp '>' shift_expression
  // 			| relational_exp '<=' shift_expression
  // 			| relational_exp '>=' shift_expression
  public static boolean relational_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RELATIONAL_EXP, "<relational exp>");
    r = shift_expression(b, l + 1);
    if (!r) r = relational_exp_1(b, l + 1);
    if (!r) r = relational_exp_2(b, l + 1);
    if (!r) r = relational_exp_3(b, l + 1);
    if (!r) r = relational_exp_4(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // relational_exp '<' shift_expression
  private static boolean relational_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_exp(b, l + 1);
    r = r && consumeToken(b, "<");
    r = r && shift_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relational_exp '>' shift_expression
  private static boolean relational_exp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_exp_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_exp(b, l + 1);
    r = r && consumeToken(b, ">");
    r = r && shift_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relational_exp '<=' shift_expression
  private static boolean relational_exp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_exp_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_exp(b, l + 1);
    r = r && consumeToken(b, "<=");
    r = r && shift_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // relational_exp '>=' shift_expression
  private static boolean relational_exp_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relational_exp_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relational_exp(b, l + 1);
    r = r && consumeToken(b, ">=");
    r = r && shift_expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'if' '(' exp ')' stat
  // 			| 'if' '(' exp ')' stat 'else' stat
  // 			| 'switch' '(' exp ')' stat
  public static boolean selection_stat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_stat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SELECTION_STAT, "<selection stat>");
    r = selection_stat_0(b, l + 1);
    if (!r) r = selection_stat_1(b, l + 1);
    if (!r) r = selection_stat_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // 'if' '(' exp ')' stat
  private static boolean selection_stat_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_stat_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "if");
    r = r && consumeToken(b, "(");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'if' '(' exp ')' stat 'else' stat
  private static boolean selection_stat_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_stat_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "if");
    r = r && consumeToken(b, "(");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && stat(b, l + 1);
    r = r && consumeToken(b, "else");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'switch' '(' exp ')' stat
  private static boolean selection_stat_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "selection_stat_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "switch");
    r = r && consumeToken(b, "(");
    r = r && exp(b, l + 1);
    r = r && consumeToken(b, ")");
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // additive_exp
  // 			| shift_expression '<<' additive_exp
  // 			| shift_expression '>>' additive_exp
  public static boolean shift_expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SHIFT_EXPRESSION, "<shift expression>");
    r = additive_exp(b, l + 1);
    if (!r) r = shift_expression_1(b, l + 1);
    if (!r) r = shift_expression_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // shift_expression '<<' additive_exp
  private static boolean shift_expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shift_expression(b, l + 1);
    r = r && consumeToken(b, "<<");
    r = r && additive_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // shift_expression '>>' additive_exp
  private static boolean shift_expression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shift_expression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shift_expression(b, l + 1);
    r = r && consumeToken(b, ">>");
    r = r && additive_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type_spec spec_qualifier_list
  // 			| type_spec
  // 			| type_qualifier spec_qualifier_list
  // 			| type_qualifier
  public static boolean spec_qualifier_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "spec_qualifier_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SPEC_QUALIFIER_LIST, "<spec qualifier list>");
    r = spec_qualifier_list_0(b, l + 1);
    if (!r) r = type_spec(b, l + 1);
    if (!r) r = spec_qualifier_list_2(b, l + 1);
    if (!r) r = type_qualifier(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_spec spec_qualifier_list
  private static boolean spec_qualifier_list_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "spec_qualifier_list_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_spec(b, l + 1);
    r = r && spec_qualifier_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type_qualifier spec_qualifier_list
  private static boolean spec_qualifier_list_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "spec_qualifier_list_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_qualifier(b, l + 1);
    r = r && spec_qualifier_list(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // labeled_stat
  // 			| exp_stat
  // 			| compound_stat
  // 			| selection_stat
  // 			| iteration_stat
  // 			| jump_stat
  public static boolean stat(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STAT, "<stat>");
    r = labeled_stat(b, l + 1);
    if (!r) r = exp_stat(b, l + 1);
    if (!r) r = compound_stat(b, l + 1);
    if (!r) r = selection_stat(b, l + 1);
    if (!r) r = iteration_stat(b, l + 1);
    if (!r) r = jump_stat(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // stat
  // 			| stat_list stat
  public static boolean stat_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STAT_LIST, "<stat list>");
    r = stat(b, l + 1);
    if (!r) r = stat_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // stat_list stat
  private static boolean stat_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stat_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = stat_list(b, l + 1);
    r = r && stat(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'auto' | 'register' | 'static' | 'extern' | 'typedef'
  public static boolean storage_class_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "storage_class_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STORAGE_CLASS_SPEC, "<storage class spec>");
    r = consumeToken(b, "auto");
    if (!r) r = consumeToken(b, "register");
    if (!r) r = consumeToken(b, "static");
    if (!r) r = consumeToken(b, "extern");
    if (!r) r = consumeToken(b, "typedef");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // spec_qualifier_list struct_declarator_list ';'
  public static boolean struct_decl(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECL, "<struct decl>");
    r = spec_qualifier_list(b, l + 1);
    r = r && struct_declarator_list(b, l + 1);
    r = r && consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // struct_decl
  // 			| struct_decl_list struct_decl
  public static boolean struct_decl_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECL_LIST, "<struct decl list>");
    r = struct_decl(b, l + 1);
    if (!r) r = struct_decl_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // struct_decl_list struct_decl
  private static boolean struct_decl_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_decl_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_decl_list(b, l + 1);
    r = r && struct_decl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // declarator
  // 			| declarator ':' const_exp
  // 			|		':' const_exp
  public static boolean struct_declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declarator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECLARATOR, "<struct declarator>");
    r = declarator(b, l + 1);
    if (!r) r = struct_declarator_1(b, l + 1);
    if (!r) r = struct_declarator_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // declarator ':' const_exp
  private static boolean struct_declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declarator_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declarator(b, l + 1);
    r = r && consumeToken(b, ":");
    r = r && const_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ':' const_exp
  private static boolean struct_declarator_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declarator_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ":");
    r = r && const_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // struct_declarator
  // 			| struct_declarator_list ',' struct_declarator
  public static boolean struct_declarator_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declarator_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_DECLARATOR_LIST, "<struct declarator list>");
    r = struct_declarator(b, l + 1);
    if (!r) r = struct_declarator_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // struct_declarator_list ',' struct_declarator
  private static boolean struct_declarator_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_declarator_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_declarator_list(b, l + 1);
    r = r && consumeToken(b, ",");
    r = r && struct_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'struct' | 'union'
  public static boolean struct_or_union(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_or_union")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_OR_UNION, "<struct or union>");
    r = consumeToken(b, "struct");
    if (!r) r = consumeToken(b, "union");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // struct_or_union id '{' struct_decl_list '}'
  // 			| struct_or_union	'{' struct_decl_list '}'
  // 			| struct_or_union id
  public static boolean struct_or_union_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_or_union_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRUCT_OR_UNION_SPEC, "<struct or union spec>");
    r = struct_or_union_spec_0(b, l + 1);
    if (!r) r = struct_or_union_spec_1(b, l + 1);
    if (!r) r = struct_or_union_spec_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // struct_or_union id '{' struct_decl_list '}'
  private static boolean struct_or_union_spec_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_or_union_spec_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_or_union(b, l + 1);
    r = r && consumeToken(b, ID);
    r = r && consumeToken(b, "{");
    r = r && struct_decl_list(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // struct_or_union	'{' struct_decl_list '}'
  private static boolean struct_or_union_spec_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_or_union_spec_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_or_union(b, l + 1);
    r = r && consumeToken(b, "{");
    r = r && struct_decl_list(b, l + 1);
    r = r && consumeToken(b, "}");
    exit_section_(b, m, null, r);
    return r;
  }

  // struct_or_union id
  private static boolean struct_or_union_spec_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "struct_or_union_spec_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = struct_or_union(b, l + 1);
    r = r && consumeToken(b, ID);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // external_decl
  // 			| translation_unit external_decl
  static boolean translation_unit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "translation_unit")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = external_decl(b, l + 1);
    if (!r) r = translation_unit_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // translation_unit external_decl
  private static boolean translation_unit_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "translation_unit_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = translation_unit(b, l + 1);
    r = r && external_decl(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // spec_qualifier_list abstract_declarator
  // 			| spec_qualifier_list
  public static boolean type_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_NAME, "<type name>");
    r = type_name_0(b, l + 1);
    if (!r) r = spec_qualifier_list(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // spec_qualifier_list abstract_declarator
  private static boolean type_name_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_name_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = spec_qualifier_list(b, l + 1);
    r = r && abstract_declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'const' | 'volatile'
  public static boolean type_qualifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_qualifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_QUALIFIER, "<type qualifier>");
    r = consumeToken(b, "const");
    if (!r) r = consumeToken(b, "volatile");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type_qualifier
  // 			| type_qualifier_list type_qualifier
  public static boolean type_qualifier_list(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_qualifier_list")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_QUALIFIER_LIST, "<type qualifier list>");
    r = type_qualifier(b, l + 1);
    if (!r) r = type_qualifier_list_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // type_qualifier_list type_qualifier
  private static boolean type_qualifier_list_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_qualifier_list_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type_qualifier_list(b, l + 1);
    r = r && type_qualifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // 'bool' | 'char' | 'short' | 'int' | 'long' | 'float' | 'half' | 'size_t'
  // 			| 'double' | 'signed' | 'unsigned' | 'ptrdiff_t' | 'intptr_t' | 'uintptr_t' | 'void'
  // 			| vector_type vector_size
  // 			| struct_or_union_spec
  // 			| enum_spec
  // 			| typedef_name
  // 			| memory_spec type_spec
  public static boolean type_spec(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_spec")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE_SPEC, "<type spec>");
    r = consumeToken(b, "bool");
    if (!r) r = consumeToken(b, "char");
    if (!r) r = consumeToken(b, "short");
    if (!r) r = consumeToken(b, "int");
    if (!r) r = consumeToken(b, "long");
    if (!r) r = consumeToken(b, "float");
    if (!r) r = consumeToken(b, "half");
    if (!r) r = consumeToken(b, "size_t");
    if (!r) r = consumeToken(b, "double");
    if (!r) r = consumeToken(b, "signed");
    if (!r) r = consumeToken(b, "unsigned");
    if (!r) r = consumeToken(b, "ptrdiff_t");
    if (!r) r = consumeToken(b, "intptr_t");
    if (!r) r = consumeToken(b, "uintptr_t");
    if (!r) r = consumeToken(b, "void");
    if (!r) r = type_spec_15(b, l + 1);
    if (!r) r = struct_or_union_spec(b, l + 1);
    if (!r) r = enum_spec(b, l + 1);
    if (!r) r = typedef_name(b, l + 1);
    if (!r) r = type_spec_19(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // vector_type vector_size
  private static boolean type_spec_15(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_spec_15")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = vector_type(b, l + 1);
    r = r && vector_size(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // memory_spec type_spec
  private static boolean type_spec_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_spec_19")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = memory_spec(b, l + 1);
    r = r && type_spec(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id
  public static boolean typedef_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typedef_name")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, TYPEDEF_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // postfix_exp
  // 			| '++' unary_exp
  // 			| '--' unary_exp
  // 			| unary_operator cast_exp
  // 			| 'sizeof' unary_exp
  // 			| 'sizeof' '(' type_name ')'
  public static boolean unary_exp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_exp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_EXP, "<unary exp>");
    r = postfix_exp(b, l + 1);
    if (!r) r = unary_exp_1(b, l + 1);
    if (!r) r = unary_exp_2(b, l + 1);
    if (!r) r = unary_exp_3(b, l + 1);
    if (!r) r = unary_exp_4(b, l + 1);
    if (!r) r = unary_exp_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // '++' unary_exp
  private static boolean unary_exp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_exp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "++");
    r = r && unary_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // '--' unary_exp
  private static boolean unary_exp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_exp_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "--");
    r = r && unary_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // unary_operator cast_exp
  private static boolean unary_exp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_exp_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unary_operator(b, l + 1);
    r = r && cast_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'sizeof' unary_exp
  private static boolean unary_exp_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_exp_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "sizeof");
    r = r && unary_exp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // 'sizeof' '(' type_name ')'
  private static boolean unary_exp_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_exp_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "sizeof");
    r = r && consumeToken(b, "(");
    r = r && type_name(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '&' | '*' | '+' | '-' | '~' | '!'
  public static boolean unary_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, UNARY_OPERATOR, "<unary operator>");
    r = consumeToken(b, "&");
    if (!r) r = consumeToken(b, "*");
    if (!r) r = consumeToken(b, "+");
    if (!r) r = consumeToken(b, "-");
    if (!r) r = consumeToken(b, "~");
    if (!r) r = consumeToken(b, "!");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '2' | '3' | '4' | '8' | '16'
  public static boolean vector_size(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_size")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VECTOR_SIZE, "<vector size>");
    r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "8");
    if (!r) r = consumeToken(b, "16");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // 'char' | 'uchar' | 'short' | 'ushort' | 'int' | 'uint' | 'long' | 'ulong' | 'float' | 'double'
  public static boolean vector_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VECTOR_TYPE, "<vector type>");
    r = consumeToken(b, "char");
    if (!r) r = consumeToken(b, "uchar");
    if (!r) r = consumeToken(b, "short");
    if (!r) r = consumeToken(b, "ushort");
    if (!r) r = consumeToken(b, "int");
    if (!r) r = consumeToken(b, "uint");
    if (!r) r = consumeToken(b, "long");
    if (!r) r = consumeToken(b, "ulong");
    if (!r) r = consumeToken(b, "float");
    if (!r) r = consumeToken(b, "double");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
