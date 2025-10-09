package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.ShieldExclamation: ImageVector
    get() {
        if (_ShieldExclamation != null) {
            return _ShieldExclamation!!
        }
        _ShieldExclamation = ImageVector.Builder(
            name = "Outlined.ShieldExclamation",
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
                moveToRelative(0f, -10.036f)
                arcTo(11.959f, 11.959f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.598f, 6f)
                arcTo(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9.75f)
                curveToRelative(0f, 5.592f, 3.824f, 10.29f, 9f, 11.622f)
                curveToRelative(5.176f, -1.332f, 9f, -6.03f, 9f, -11.622f)
                curveToRelative(0f, -1.31f, -0.21f, -2.57f, -0.598f, -3.75f)
                horizontalLineToRelative(-0.152f)
                curveToRelative(-3.196f, 0f, -6.1f, -1.25f, -8.25f, -3.286f)
                close()
                moveTo(12f, 15.75f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.008f)
                lineTo(12f, 15.758f)
                verticalLineToRelative(-0.008f)
                close()
            }
        }.build()

        return _ShieldExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldExclamation: ImageVector? = null
