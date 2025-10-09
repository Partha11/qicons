package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CurrencyPound: ImageVector
    get() {
        if (_CurrencyPound != null) {
            return _CurrencyPound!!
        }
        _CurrencyPound = ImageVector.Builder(
            name = "Outlined.CurrencyPound",
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
                moveTo(14.121f, 7.629f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.017f, 9.43f)
                curveToRelative(-0.023f, 0.212f, -0.002f, 0.425f, 0.028f, 0.636f)
                lineToRelative(0.506f, 3.541f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.43f, 2.65f)
                lineTo(9f, 16.5f)
                lineToRelative(1.539f, -0.513f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.422f, 0f)
                lineToRelative(0.655f, 0.218f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.718f, -0.122f)
                lineTo(15f, 15.75f)
                moveTo(8.25f, 12f)
                horizontalLineTo(12f)
                moveToRelative(9f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
            }
        }.build()

        return _CurrencyPound!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyPound: ImageVector? = null
