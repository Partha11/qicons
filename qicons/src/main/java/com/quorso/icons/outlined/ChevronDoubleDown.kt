package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ChevronDoubleDown: ImageVector
    get() {
        if (_ChevronDoubleDown != null) {
            return _ChevronDoubleDown!!
        }
        _ChevronDoubleDown = ImageVector.Builder(
            name = "Outlined.ChevronDoubleDown",
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
                moveToRelative(4.5f, 5.25f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(7.5f, -7.5f)
                moveToRelative(-15f, 6f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(7.5f, -7.5f)
            }
        }.build()

        return _ChevronDoubleDown!!
    }

@Suppress("ObjectPropertyName")
private var _ChevronDoubleDown: ImageVector? = null
