package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.DocumentArrowUp: ImageVector
    get() {
        if (_DocumentArrowUp != null) {
            return _DocumentArrowUp!!
        }
        _DocumentArrowUp = ImageVector.Builder(
            name = "Filled.DocumentArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.625f, 1.5f)
                lineTo(9f, 1.5f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 3.75f)
                verticalLineToRelative(1.875f)
                curveToRelative(0f, 1.036f, 0.84f, 1.875f, 1.875f, 1.875f)
                lineTo(16.5f, 9f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.75f, 3.75f)
                verticalLineToRelative(7.875f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                lineTo(5.625f, 22.5f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.875f, -1.875f)
                lineTo(3.75f, 3.375f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                close()
                moveTo(12.53f, 11.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, 1.06f)
                lineToRelative(1.72f, -1.72f)
                lineTo(11.25f, 18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-4.19f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.06f)
                lineToRelative(-3f, -3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.25f, 5.25f)
                arcToRelative(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.279f, -3.434f)
                arcToRelative(9.768f, 9.768f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.963f, 6.963f)
                arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 7.5f)
                horizontalLineToRelative(-1.875f)
                arcToRelative(0.375f, 0.375f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.375f, -0.375f)
                verticalLineTo(5.25f)
                close()
            }
        }.build()

        return _DocumentArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentArrowUp: ImageVector? = null
