package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.PaintBrush: ImageVector
    get() {
        if (_PaintBrush != null) {
            return _PaintBrush!!
        }
        _PaintBrush = ImageVector.Builder(
            name = "Filled.PaintBrush",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.599f, 1.5f)
                curveToRelative(-0.376f, 0f, -0.743f, 0.111f, -1.055f, 0.32f)
                lineToRelative(-5.08f, 3.385f)
                arcToRelative(18.747f, 18.747f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.471f, 2.987f)
                arcToRelative(10.04f, 10.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.815f, 4.815f)
                arcToRelative(18.748f, 18.748f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.987f, -3.472f)
                lineToRelative(3.386f, -5.079f)
                arcTo(1.902f, 1.902f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.599f, 1.5f)
                close()
                moveTo(12.299f, 15.525f)
                arcToRelative(18.76f, 18.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.896f, -1.207f)
                arcToRelative(8.026f, 8.026f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.513f, -4.513f)
                arcTo(18.75f, 18.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.475f, 11.7f)
                lineToRelative(-0.278f, 0.5f)
                arcToRelative(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.601f, 3.602f)
                lineToRelative(0.502f, -0.278f)
                close()
                moveTo(6.75f, 13.5f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 17.25f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.601f, 1.497f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.7f, 1.123f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.8f, -2.62f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.75f, -3.75f)
                close()
            }
        }.build()

        return _PaintBrush!!
    }

@Suppress("ObjectPropertyName")
private var _PaintBrush: ImageVector? = null
