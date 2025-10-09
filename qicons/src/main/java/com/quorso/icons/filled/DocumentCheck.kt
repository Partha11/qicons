package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.DocumentCheck: ImageVector
    get() {
        if (_DocumentCheck != null) {
            return _DocumentCheck!!
        }
        _DocumentCheck = ImageVector.Builder(
            name = "Filled.DocumentCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 1.5f)
                lineTo(5.625f, 1.5f)
                curveToRelative(-1.036f, 0f, -1.875f, 0.84f, -1.875f, 1.875f)
                verticalLineToRelative(17.25f)
                curveToRelative(0f, 1.035f, 0.84f, 1.875f, 1.875f, 1.875f)
                horizontalLineToRelative(12.75f)
                curveToRelative(1.035f, 0f, 1.875f, -0.84f, 1.875f, -1.875f)
                lineTo(20.25f, 12.75f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 9f)
                horizontalLineToRelative(-1.875f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.875f, -1.875f)
                lineTo(12.75f, 5.25f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 1.5f)
                close()
                moveTo(15.61f, 12.436f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.22f, -0.872f)
                lineToRelative(-3.236f, 4.53f)
                lineTo(9.53f, 14.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, 1.06f)
                lineToRelative(2.25f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.14f, -0.094f)
                lineToRelative(3.75f, -5.25f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.971f, 1.816f)
                arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.25f, 5.25f)
                verticalLineToRelative(1.875f)
                curveToRelative(0f, 0.207f, 0.168f, 0.375f, 0.375f, 0.375f)
                horizontalLineTo(16.5f)
                arcToRelative(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.434f, 1.279f)
                arcToRelative(9.768f, 9.768f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.963f, -6.963f)
                close()
            }
        }.build()

        return _DocumentCheck!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCheck: ImageVector? = null
