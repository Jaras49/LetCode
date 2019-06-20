package com.letcode.symmetric.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeSolutionTest {

    private SymmetricTree symmetricTree = new SymmetricTreeSolution();

    @Test
    void shouldReturnTrue() {
        //given
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        //when
        boolean isSymmetric = symmetricTree.isSymmetric(root);

        //then
        assertTrue(isSymmetric);
    }

    @Test
    void shouldReturnFalse() {
        //given
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        //when
        boolean isSymmetric = symmetricTree.isSymmetric(root);

        //then
        assertFalse(isSymmetric);
    }
}