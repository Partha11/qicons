package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.MagnifyingGlassCircle: ImageVector
    get() {
        if (_MagnifyingGlassCircle != null) {
            return _MagnifyingGlassCircle!!
        }
        _MagnifyingGlassCircle = ImageVector.Builder(
            name = "Filled.MagnifyingGlassCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.25f, 10.875f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.25f, 0f)
                arcToRelative(2.625f, 2.625f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.25f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2.25f)
                curveToRelative(-5.385f, 0f, -9.75f, 4.365f, -9.75f, 9.75f)
                reflectiveCurveToRelative(4.365f, 9.75f, 9.75f, 9.75f)
                reflectiveCurveToRelative(9.75f, -4.365f, 9.75f, -9.75f)
                reflectiveCurveTo(17.385f, 2.25f, 12f, 2.25f)
                close()
                moveTo(10.875f, 6.75f)
                arcToRelative(4.125f, 4.125f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.338f, 7.524f)
                lineToRelative(2.007f, 2.006f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.06f, -1.06f)
                lineToRelative(-2.006f, -2.007f)
                arcToRelative(4.125f, 4.125f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.399f, -6.463f)
                close()
            }
        }.build()

        return _MagnifyingGlassCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyingGlassCircle: ImageVector? = null
