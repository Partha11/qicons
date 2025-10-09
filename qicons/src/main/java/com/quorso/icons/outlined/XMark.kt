package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.XMark: ImageVector
    get() {
        if (_XMark != null) {
            return _XMark!!
        }
        _XMark = ImageVector.Builder(
            name = "Outlined.XMark",
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
                moveTo(6f, 18f)
                lineTo(18f, 6f)
                moveTo(6f, 6f)
                lineToRelative(12f, 12f)
            }
        }.build()

        return _XMark!!
    }

@Suppress("ObjectPropertyName")
private var _XMark: ImageVector? = null
