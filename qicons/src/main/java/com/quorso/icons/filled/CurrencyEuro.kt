package com.quorso.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Filled.CurrencyEuro: ImageVector
    get() {
        if (_CurrencyEuro != null) {
            return _CurrencyEuro!!
        }
        _CurrencyEuro = ImageVector.Builder(
            name = "Filled.CurrencyEuro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                moveTo(10.098f, 9.348f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.903f, -0.884f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.498f, -1.415f)
                arcTo(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.005f, 9.75f)
                lineTo(7.5f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(0.054f)
                arcToRelative(5.281f, 5.281f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                lineTo(7.5f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f)
                horizontalLineToRelative(0.505f)
                arcToRelative(5.25f, 5.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.494f, 2.701f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.498f, -1.415f)
                arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.252f, -1.286f)
                horizontalLineToRelative(3.001f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                lineTo(9.075f, 12.75f)
                arcToRelative(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                horizontalLineToRelative(3.675f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(0.105f, -0.14f, 0.221f, -0.274f, 0.348f, -0.402f)
                close()
            }
        }.build()

        return _CurrencyEuro!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEuro: ImageVector? = null
