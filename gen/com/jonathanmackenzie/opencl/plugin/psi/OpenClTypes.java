// This is a generated file. Not intended for manual editing.
package com.jonathanmackenzie.opencl.plugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.jonathanmackenzie.opencl.plugin.psi.impl.*;

public interface OpenClTypes {

  IElementType ABSTRACT_DECLARATOR = new OpenClElementType("ABSTRACT_DECLARATOR");
  IElementType ADDITIVE_EXP = new OpenClElementType("ADDITIVE_EXP");
  IElementType AND_EXP = new OpenClElementType("AND_EXP");
  IElementType ARGUMENT_EXP_LIST = new OpenClElementType("ARGUMENT_EXP_LIST");
  IElementType ASSIGNMENT_EXP = new OpenClElementType("ASSIGNMENT_EXP");
  IElementType ASSIGNMENT_OPERATOR = new OpenClElementType("ASSIGNMENT_OPERATOR");
  IElementType CAST_EXP = new OpenClElementType("CAST_EXP");
  IElementType COMPOUND_STAT = new OpenClElementType("COMPOUND_STAT");
  IElementType CONDITIONAL_EXP = new OpenClElementType("CONDITIONAL_EXP");
  IElementType CONST = new OpenClElementType("CONST");
  IElementType CONST_EXP = new OpenClElementType("CONST_EXP");
  IElementType DECL = new OpenClElementType("DECL");
  IElementType DECLARATOR = new OpenClElementType("DECLARATOR");
  IElementType DECL_LIST = new OpenClElementType("DECL_LIST");
  IElementType DECL_SPECS = new OpenClElementType("DECL_SPECS");
  IElementType DIRECT_ABSTRACT_DECLARATOR = new OpenClElementType("DIRECT_ABSTRACT_DECLARATOR");
  IElementType DIRECT_DECLARATOR = new OpenClElementType("DIRECT_DECLARATOR");
  IElementType ENUMERATOR = new OpenClElementType("ENUMERATOR");
  IElementType ENUMERATOR_LIST = new OpenClElementType("ENUMERATOR_LIST");
  IElementType ENUM_SPEC = new OpenClElementType("ENUM_SPEC");
  IElementType EQUALITY_EXP = new OpenClElementType("EQUALITY_EXP");
  IElementType EXCLUSIVE_OR_EXP = new OpenClElementType("EXCLUSIVE_OR_EXP");
  IElementType EXP = new OpenClElementType("EXP");
  IElementType EXP_STAT = new OpenClElementType("EXP_STAT");
  IElementType EXTERNAL_DECL = new OpenClElementType("EXTERNAL_DECL");
  IElementType FUNCTION_DEFINITION = new OpenClElementType("FUNCTION_DEFINITION");
  IElementType ID_LIST = new OpenClElementType("ID_LIST");
  IElementType INCLUSIVE_OR_EXP = new OpenClElementType("INCLUSIVE_OR_EXP");
  IElementType INITIALIZER = new OpenClElementType("INITIALIZER");
  IElementType INITIALIZER_LIST = new OpenClElementType("INITIALIZER_LIST");
  IElementType INIT_DECLARATOR = new OpenClElementType("INIT_DECLARATOR");
  IElementType INIT_DECLARATOR_LIST = new OpenClElementType("INIT_DECLARATOR_LIST");
  IElementType ITERATION_STAT = new OpenClElementType("ITERATION_STAT");
  IElementType JUMP_STAT = new OpenClElementType("JUMP_STAT");
  IElementType LABELED_STAT = new OpenClElementType("LABELED_STAT");
  IElementType LOGICAL_AND_EXP = new OpenClElementType("LOGICAL_AND_EXP");
  IElementType LOGICAL_OR_EXP = new OpenClElementType("LOGICAL_OR_EXP");
  IElementType MEMORY_SPEC = new OpenClElementType("MEMORY_SPEC");
  IElementType MULT_EXP = new OpenClElementType("MULT_EXP");
  IElementType PARAM_DECL = new OpenClElementType("PARAM_DECL");
  IElementType PARAM_LIST = new OpenClElementType("PARAM_LIST");
  IElementType PARAM_TYPE_LIST = new OpenClElementType("PARAM_TYPE_LIST");
  IElementType POINTER = new OpenClElementType("POINTER");
  IElementType POSTFIX_EXP = new OpenClElementType("POSTFIX_EXP");
  IElementType PRIMARY_EXP = new OpenClElementType("PRIMARY_EXP");
  IElementType RELATIONAL_EXP = new OpenClElementType("RELATIONAL_EXP");
  IElementType SELECTION_STAT = new OpenClElementType("SELECTION_STAT");
  IElementType SHIFT_EXPRESSION = new OpenClElementType("SHIFT_EXPRESSION");
  IElementType SPEC_QUALIFIER_LIST = new OpenClElementType("SPEC_QUALIFIER_LIST");
  IElementType STAT = new OpenClElementType("STAT");
  IElementType STAT_LIST = new OpenClElementType("STAT_LIST");
  IElementType STORAGE_CLASS_SPEC = new OpenClElementType("STORAGE_CLASS_SPEC");
  IElementType STRUCT_DECL = new OpenClElementType("STRUCT_DECL");
  IElementType STRUCT_DECLARATOR = new OpenClElementType("STRUCT_DECLARATOR");
  IElementType STRUCT_DECLARATOR_LIST = new OpenClElementType("STRUCT_DECLARATOR_LIST");
  IElementType STRUCT_DECL_LIST = new OpenClElementType("STRUCT_DECL_LIST");
  IElementType STRUCT_OR_UNION = new OpenClElementType("STRUCT_OR_UNION");
  IElementType STRUCT_OR_UNION_SPEC = new OpenClElementType("STRUCT_OR_UNION_SPEC");
  IElementType TYPEDEF_NAME = new OpenClElementType("TYPEDEF_NAME");
  IElementType TYPE_NAME = new OpenClElementType("TYPE_NAME");
  IElementType TYPE_QUALIFIER = new OpenClElementType("TYPE_QUALIFIER");
  IElementType TYPE_QUALIFIER_LIST = new OpenClElementType("TYPE_QUALIFIER_LIST");
  IElementType TYPE_SPEC = new OpenClElementType("TYPE_SPEC");
  IElementType UNARY_EXP = new OpenClElementType("UNARY_EXP");
  IElementType UNARY_OPERATOR = new OpenClElementType("UNARY_OPERATOR");
  IElementType VECTOR_SIZE = new OpenClElementType("VECTOR_SIZE");
  IElementType VECTOR_TYPE = new OpenClElementType("VECTOR_TYPE");

  IElementType CHAR_CONST = new OpenClTokenType("char_const");
  IElementType CONST_$ = new OpenClTokenType("const_$");
  IElementType ENUMERATION_CONST = new OpenClTokenType("enumeration_const");
  IElementType FLOAT_CONST = new OpenClTokenType("float_const");
  IElementType ID = new OpenClTokenType("id");
  IElementType INT_CONST = new OpenClTokenType("int_const");
  IElementType STRING = new OpenClTokenType("string");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ABSTRACT_DECLARATOR) {
        return new OpenCLAbstractDeclaratorImpl(node);
      }
      else if (type == ADDITIVE_EXP) {
        return new OpenCLAdditiveExpImpl(node);
      }
      else if (type == AND_EXP) {
        return new OpenCLAndExpImpl(node);
      }
      else if (type == ARGUMENT_EXP_LIST) {
        return new OpenCLArgumentExpListImpl(node);
      }
      else if (type == ASSIGNMENT_EXP) {
        return new OpenCLAssignmentExpImpl(node);
      }
      else if (type == ASSIGNMENT_OPERATOR) {
        return new OpenCLAssignmentOperatorImpl(node);
      }
      else if (type == CAST_EXP) {
        return new OpenCLCastExpImpl(node);
      }
      else if (type == COMPOUND_STAT) {
        return new OpenCLCompoundStatImpl(node);
      }
      else if (type == CONDITIONAL_EXP) {
        return new OpenCLConditionalExpImpl(node);
      }
      else if (type == CONST) {
        return new OpenCLConstImpl(node);
      }
      else if (type == CONST_EXP) {
        return new OpenCLConstExpImpl(node);
      }
      else if (type == DECL) {
        return new OpenCLDeclImpl(node);
      }
      else if (type == DECLARATOR) {
        return new OpenCLDeclaratorImpl(node);
      }
      else if (type == DECL_LIST) {
        return new OpenCLDeclListImpl(node);
      }
      else if (type == DECL_SPECS) {
        return new OpenCLDeclSpecsImpl(node);
      }
      else if (type == DIRECT_ABSTRACT_DECLARATOR) {
        return new OpenCLDirectAbstractDeclaratorImpl(node);
      }
      else if (type == DIRECT_DECLARATOR) {
        return new OpenCLDirectDeclaratorImpl(node);
      }
      else if (type == ENUMERATOR) {
        return new OpenCLEnumeratorImpl(node);
      }
      else if (type == ENUMERATOR_LIST) {
        return new OpenCLEnumeratorListImpl(node);
      }
      else if (type == ENUM_SPEC) {
        return new OpenCLEnumSpecImpl(node);
      }
      else if (type == EQUALITY_EXP) {
        return new OpenCLEqualityExpImpl(node);
      }
      else if (type == EXCLUSIVE_OR_EXP) {
        return new OpenCLExclusiveOrExpImpl(node);
      }
      else if (type == EXP) {
        return new OpenCLExpImpl(node);
      }
      else if (type == EXP_STAT) {
        return new OpenCLExpStatImpl(node);
      }
      else if (type == EXTERNAL_DECL) {
        return new OpenCLExternalDeclImpl(node);
      }
      else if (type == FUNCTION_DEFINITION) {
        return new OpenCLFunctionDefinitionImpl(node);
      }
      else if (type == ID_LIST) {
        return new OpenCLIdListImpl(node);
      }
      else if (type == INCLUSIVE_OR_EXP) {
        return new OpenCLInclusiveOrExpImpl(node);
      }
      else if (type == INITIALIZER) {
        return new OpenCLInitializerImpl(node);
      }
      else if (type == INITIALIZER_LIST) {
        return new OpenCLInitializerListImpl(node);
      }
      else if (type == INIT_DECLARATOR) {
        return new OpenCLInitDeclaratorImpl(node);
      }
      else if (type == INIT_DECLARATOR_LIST) {
        return new OpenCLInitDeclaratorListImpl(node);
      }
      else if (type == ITERATION_STAT) {
        return new OpenCLIterationStatImpl(node);
      }
      else if (type == JUMP_STAT) {
        return new OpenCLJumpStatImpl(node);
      }
      else if (type == LABELED_STAT) {
        return new OpenCLLabeledStatImpl(node);
      }
      else if (type == LOGICAL_AND_EXP) {
        return new OpenCLLogicalAndExpImpl(node);
      }
      else if (type == LOGICAL_OR_EXP) {
        return new OpenCLLogicalOrExpImpl(node);
      }
      else if (type == MEMORY_SPEC) {
        return new OpenCLMemorySpecImpl(node);
      }
      else if (type == MULT_EXP) {
        return new OpenCLMultExpImpl(node);
      }
      else if (type == PARAM_DECL) {
        return new OpenCLParamDeclImpl(node);
      }
      else if (type == PARAM_LIST) {
        return new OpenCLParamListImpl(node);
      }
      else if (type == PARAM_TYPE_LIST) {
        return new OpenCLParamTypeListImpl(node);
      }
      else if (type == POINTER) {
        return new OpenCLPointerImpl(node);
      }
      else if (type == POSTFIX_EXP) {
        return new OpenCLPostfixExpImpl(node);
      }
      else if (type == PRIMARY_EXP) {
        return new OpenCLPrimaryExpImpl(node);
      }
      else if (type == RELATIONAL_EXP) {
        return new OpenCLRelationalExpImpl(node);
      }
      else if (type == SELECTION_STAT) {
        return new OpenCLSelectionStatImpl(node);
      }
      else if (type == SHIFT_EXPRESSION) {
        return new OpenCLShiftExpressionImpl(node);
      }
      else if (type == SPEC_QUALIFIER_LIST) {
        return new OpenCLSpecQualifierListImpl(node);
      }
      else if (type == STAT) {
        return new OpenCLStatImpl(node);
      }
      else if (type == STAT_LIST) {
        return new OpenCLStatListImpl(node);
      }
      else if (type == STORAGE_CLASS_SPEC) {
        return new OpenCLStorageClassSpecImpl(node);
      }
      else if (type == STRUCT_DECL) {
        return new OpenCLStructDeclImpl(node);
      }
      else if (type == STRUCT_DECLARATOR) {
        return new OpenCLStructDeclaratorImpl(node);
      }
      else if (type == STRUCT_DECLARATOR_LIST) {
        return new OpenCLStructDeclaratorListImpl(node);
      }
      else if (type == STRUCT_DECL_LIST) {
        return new OpenCLStructDeclListImpl(node);
      }
      else if (type == STRUCT_OR_UNION) {
        return new OpenCLStructOrUnionImpl(node);
      }
      else if (type == STRUCT_OR_UNION_SPEC) {
        return new OpenCLStructOrUnionSpecImpl(node);
      }
      else if (type == TYPEDEF_NAME) {
        return new OpenCLTypedefNameImpl(node);
      }
      else if (type == TYPE_NAME) {
        return new OpenCLTypeNameImpl(node);
      }
      else if (type == TYPE_QUALIFIER) {
        return new OpenCLTypeQualifierImpl(node);
      }
      else if (type == TYPE_QUALIFIER_LIST) {
        return new OpenCLTypeQualifierListImpl(node);
      }
      else if (type == TYPE_SPEC) {
        return new OpenCLTypeSpecImpl(node);
      }
      else if (type == UNARY_EXP) {
        return new OpenCLUnaryExpImpl(node);
      }
      else if (type == UNARY_OPERATOR) {
        return new OpenCLUnaryOperatorImpl(node);
      }
      else if (type == VECTOR_SIZE) {
        return new OpenCLVectorSizeImpl(node);
      }
      else if (type == VECTOR_TYPE) {
        return new OpenCLVectorTypeImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
