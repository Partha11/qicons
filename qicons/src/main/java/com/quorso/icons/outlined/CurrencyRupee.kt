package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CurrencyRupee: ImageVector
    get() {
        if (_CurrencyRupee != null) {
            return _CurrencyRupee!!
        }
        _CurrencyRupee = ImageVector.Builder(
            name = "Outlined.CurrencyRupee",
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
                moveTo(15f, 8.25f)
                horizontalLineTo(9f)
                moveToRelative(6f, 3f)
                horizontalLineTo(9f)
                moveToRelative(3f, 6f)
                lineToRelative(-3f, -3f)
                horizontalLineToRelative(1.5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -6f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
            }
        }.build()

        return _CurrencyRupee!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyRupee: ImageVector? = null
