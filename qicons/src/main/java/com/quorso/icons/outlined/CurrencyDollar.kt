package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CurrencyDollar: ImageVector
    get() {
        if (_CurrencyDollar != null) {
            return _CurrencyDollar!!
        }
        _CurrencyDollar = ImageVector.Builder(
            name = "Outlined.CurrencyDollar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                verticalLineToRelative(12f)
                moveToRelative(-3f, -2.818f)
                lineToRelative(0.879f, 0.659f)
                curveToRelative(1.171f, 0.879f, 3.07f, 0.879f, 4.242f, 0f)
                curveToRelative(1.172f, -0.879f, 1.172f, -2.303f, 0f, -3.182f)
                curveTo(13.536f, 12.219f, 12.768f, 12f, 12f, 12f)
                curveToRelative(-0.725f, 0f, -1.45f, -0.22f, -2.003f, -0.659f)
                curveToRelative(-1.106f, -0.879f, -1.106f, -2.303f, 0f, -3.182f)
                reflectiveCurveToRelative(2.9f, -0.879f, 4.006f, 0f)
                lineToRelative(0.415f, 0.33f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
            }
        }.build()

        return _CurrencyDollar!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyDollar: ImageVector? = null
