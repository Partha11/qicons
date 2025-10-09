package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CurrencyYen: ImageVector
    get() {
        if (_CurrencyYen != null) {
            return _CurrencyYen!!
        }
        _CurrencyYen = ImageVector.Builder(
            name = "Outlined.CurrencyYen",
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
                moveToRelative(9f, 7.5f)
                lineToRelative(3f, 4.5f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, -4.5f)
                moveTo(12f, 12f)
                verticalLineToRelative(5.25f)
                moveTo(15f, 12f)
                horizontalLineTo(9f)
                moveToRelative(6f, 3f)
                horizontalLineTo(9f)
                moveToRelative(12f, -3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
            }
        }.build()

        return _CurrencyYen!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyYen: ImageVector? = null
