package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ChevronDoubleLeft: ImageVector
    get() {
        if (_ChevronDoubleLeft != null) {
            return _ChevronDoubleLeft!!
        }
        _ChevronDoubleLeft = ImageVector.Builder(
            name = "Outlined.ChevronDoubleLeft",
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
                moveToRelative(18.75f, 4.5f)
                lineToRelative(-7.5f, 7.5f)
                lineToRelative(7.5f, 7.5f)
                moveToRelative(-6f, -15f)
                lineTo(5.25f, 12f)
                lineToRelative(7.5f, 7.5f)
            }
        }.build()

        return _ChevronDoubleLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDoubleLeft: ImageVector? = null
