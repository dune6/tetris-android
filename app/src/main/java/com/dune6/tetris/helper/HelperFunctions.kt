package com.dune6.tetris.helper

fun array2dOfByte(sizeOuter: Int, sizeInner: Int): Array<ByteArray> =
    Array(sizeOuter) {
        ByteArray(sizeInner)
    }