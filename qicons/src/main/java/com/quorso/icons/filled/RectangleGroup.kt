package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.RectangleGroup: ImageVector
    get() {
        if (_RectangleGroup != null) {
            return _RectangleGroup!!
        }
        _RectangleGroup = ImageVector.Builder(
            name = "Filled.RectangleGroup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.5f, 7.125f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(6f)
                curveToRelative(1.036f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(3.75f)
                curveToRelative(0f, 1.036f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineToRelative(-6f)
                arcTo(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 10.875f)
                verticalLineToRelative(-3.75f)
                close()
                moveTo(13.5f, 8.625f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(5.25f)
                curveToRelative(1.035f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(8.25f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineToRelative(-5.25f)
                arcToRelative(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.875f, -1.875f)
                verticalLineToRelative(-8.25f)
                close()
                moveTo(3f, 16.125f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(5.25f)
                curveToRelative(1.036f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(2.25f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineToRelative(-5.25f)
                arcTo(1.875f, 1.875f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.375f)
                verticalLineToRelative(-2.25f)
                close()
            }
        }.build()

        return _RectangleGroup!!
    }

@Suppress("ObjectPropertyName")
private var _RectangleGroup: ImageVector? = null
