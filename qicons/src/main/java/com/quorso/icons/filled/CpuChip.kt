package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.CpuChip: ImageVector
    get() {
        if (_CpuChip != null) {
            return _CpuChip!!
        }
        _CpuChip = ImageVector.Builder(
            name = "Filled.CpuChip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 7.5f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-9f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.25f, 2.25f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 3f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(2.25f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(0.75f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(0.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(0.75f)
                horizontalLineTo(21f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(2.25f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(0.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                horizontalLineToRelative(-0.75f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-2.25f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.75f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(-0.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineToRelative(-0.75f)
                horizontalLineTo(3f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 15f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-2.25f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(0.75f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(-0.75f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(0.75f)
                verticalLineTo(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                close()
                moveTo(6f, 6.75f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.75f, 6f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, 0.75f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                verticalLineTo(6.75f)
                close()
            }
        }.build()

        return _CpuChip!!
    }

@Suppress("ObjectPropertyName")
private var _CpuChip: ImageVector? = null
