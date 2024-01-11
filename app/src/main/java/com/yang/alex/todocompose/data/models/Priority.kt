package com.yang.alex.todocompose.data.models

import androidx.compose.ui.graphics.Color
import com.yang.alex.todocompose.ui.theme.HighPriorityColor
import com.yang.alex.todocompose.ui.theme.LowPriorityColor
import com.yang.alex.todocompose.ui.theme.MediumPriorityColor
import com.yang.alex.todocompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}