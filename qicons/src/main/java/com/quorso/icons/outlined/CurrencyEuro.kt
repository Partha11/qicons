package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CurrencyEuro: ImageVector
    get() {
        if (_CurrencyEuro != null) {
            return _CurrencyEuro!!
        }
        _CurrencyEuro = ImageVector.Builder(
            name = "Outlined.CurrencyEuro",
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
                moveTo(14.25f, 7.756f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 8.488f)
                moveTo(7.5f, 10.5f)
                horizontalLineToRelative(5.25f)
                moveToRelative(-5.25f, 3f)
                horizontalLineToRelative(5.25f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
            }
        }.build()

        return _CurrencyEuro!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyEuro: ImageVector? = null
