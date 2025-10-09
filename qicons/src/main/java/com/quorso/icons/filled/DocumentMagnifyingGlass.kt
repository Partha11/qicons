package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.DocumentMagnifyingGlass: ImageVector
    get() {
        if (_DocumentMagnifyingGlass != null) {
            return _DocumentMagnifyingGlass!!
        }
        _DocumentMagnifyingGlass = ImageVector.Builder(
            name = "Filled.DocumentMagnifyingGlass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.625f, 16.5f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -3.75f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.75f)
                close()
            }
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
                moveTo(11.625f, 18f)
                curveToRelative(0.66f, 0f, 1.277f, -0.19f, 1.797f, -0.518f)
                lineToRelative(1.048f, 1.048f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, -1.06f)
                lineToRelative(-1.047f, -1.048f)
                arcTo(3.375f, 3.375f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.625f, 18f)
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

        return _DocumentMagnifyingGlass!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentMagnifyingGlass: ImageVector? = null
