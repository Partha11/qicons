package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.MinusSmall: ImageVector
    get() {
        if (_MinusSmall != null) {
            return _MinusSmall!!
        }
        _MinusSmall = ImageVector.Builder(
            name = "Outlined.MinusSmall",
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
                moveTo(18f, 12f)
                horizontalLineTo(6f)
            }
        }.build()

        return _MinusSmall!!
    }

@Suppress("ObjectPropertyName")
private var _MinusSmall: ImageVector? = null
