package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ExclamationCircle: ImageVector
    get() {
        if (_ExclamationCircle != null) {
            return _ExclamationCircle!!
        }
        _ExclamationCircle = ImageVector.Builder(
            name = "Outlined.ExclamationCircle",
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
                moveTo(12f, 9f)
                verticalLineToRelative(3.75f)
                moveToRelative(9f, -0.75f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
                moveTo(12f, 15.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(12f, 15.758f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()

        return _ExclamationCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ExclamationCircle: ImageVector? = null
