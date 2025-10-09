package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.Newspaper: ImageVector
    get() {
        if (_Newspaper != null) {
            return _Newspaper!!
        }
        _Newspaper = ImageVector.Builder(
            name = "Filled.Newspaper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.125f, 3f)
                curveTo(3.089f, 3f, 2.25f, 3.84f, 2.25f, 4.875f)
                lineTo(2.25f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(17.25f, 4.875f)
                curveTo(17.25f, 3.839f, 16.41f, 3f, 15.375f, 3f)
                lineTo(4.125f, 3f)
                close()
                moveTo(12f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                lineTo(12f, 9.75f)
                close()
                moveTo(11.25f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(12f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                close()
                moveTo(6f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                lineTo(6f, 12.75f)
                close()
                moveTo(5.25f, 16.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                lineTo(6f, 17.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -0.75f)
                close()
                moveTo(6f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.75f)
                verticalLineToRelative(-3f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 6.75f)
                lineTo(6f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.75f, 6.75f)
                horizontalLineToRelative(1.875f)
                curveToRelative(0.621f, 0f, 1.125f, 0.504f, 1.125f, 1.125f)
                verticalLineTo(18f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 0f)
                verticalLineTo(6.75f)
                close()
            }
        }.build()

        return _Newspaper!!
    }

@Suppress("ObjectPropertyName")
private var _Newspaper: ImageVector? = null
